package Controller;

import Model.*;
import Model.ChanceCards.ChanceCard;
import Model.Tiles.Tile;
import View.*;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.io.IOException;
import java.util.HashMap;

public class GameController {


    public static void main(String[] args) throws IOException {


        // loads the file of the corresponding language input string
        HashMap<String, String> stringList = Language.languageInit("Danish");

        // Different prices for each purchasable property
        BuildableTilePrices[] buildTilePrices = BuildableTilePrices.tilesPriceData();
        CompanyTilePrices[] companyTilePrices = CompanyTilePrices.companyData();
        // Loads the GUI and the playing field.
        GUI_Street[] fields = new GUI_Street[40];
        GUI gui = BoardView.initBoard(stringList, fields, GUIBoardData.tilesGUIData(stringList), buildTilePrices, companyTilePrices);

        // Objects getting initialized for later use in the game
        //************************************************************************************
        Player[] players = Player.playerList(PlayerView.getNumberOfPlayers(gui, stringList));
        Player currentPlayer = new Player(0,0,false,0);
        BankruptPlayers bankruptPlayers = new BankruptPlayers(players);
        GUI_Player[] gui_players = PlayerView.displayAddPlayer(stringList, gui, fields, players);
        // Loads the object that determines the different color groups for each purchasable tile.
        PropertyGroup[] propertyGroups = PropertyGroup.tileGroups();
        // Loads the object that stores the owners for different purchasable tile.
        TileOwners owners = new TileOwners();
        ChanceCardController chanceCards = new ChanceCardController(currentPlayer);
        ChanceCard[] cardList = chanceCards.cardArrayInit(currentPlayer,players);
        ChanceCardController.cardShuffle(cardList);
        // Loads the effects that tiles do automatically.
        Tile[] tileEffects = BoardControllerA.boardTiles(buildTilePrices,currentPlayer,players,owners,propertyGroups, cardList, gui, stringList);
        // Loads the dice objects
        Dice dice1 = new Dice(0);
        Dice dice2 = new Dice(0);
        //************************************************************************************


        //Simple variables getting initialized for later use in the game
        //************************************************************************************
        int currentPlayerNum = players.length - 1;
        int sumOfDice;
        int position = 0;
        String menuString = "";
        //************************************************************************************


        while (true){
            PropertyOwnerView.tilDescriptions(fields);

            // Assigns the current players number, and the current player of the round
            currentPlayerNum = Player.switchPlayer(currentPlayerNum,players,bankruptPlayers);
            currentPlayer = players[currentPlayerNum];

            dice1.rollDice();
            dice2.rollDice();
            sumOfDice = dice1.getFaceValue() + dice2.getFaceValue();
            // Moves the player with the sum of the 2 dice.
            currentPlayer.addPosition(sumOfDice);
            position = currentPlayer.getPosition();
            // Creates a roll button on the GUI
            PlayerView.rollScreen(gui,stringList);


            // Makes the dice appear on the GUI
            PlayerView.displayDice(gui,dice1.getFaceValue(),dice2.getFaceValue());
            // Updates the gui_players balance to the same as the stored value in the players
            PlayerView.updateBalances(gui_players,players);
            // Moves the currentPlayer on the board GUI
            PlayerView.updatePosition(fields, gui_players, players);
            // Triggers the effect that a tile can have ex: Pay rent, draw a chance card, go to jail ect.
            tileEffects[position].executeTile(currentPlayer);
            // Updates the gui_players balance to the same as the stored value in the players
            PlayerView.updateBalances(gui_players,players);
            // Moves the currentPlayer on the board GUI
            PlayerView.updatePosition(fields, gui_players, players);

            // ONLY FOR TESTING DELETE WHEN PROJECT IS DONE!!!!
            //****************************************************
            //****************************************************
//                owners.setTileOwner(1,1);
//                owners.setTileOwner(3,1);
            //****************************************************
            //****************************************************


            while(true){
                // Shows a menu with buttons that dictates the choices a player can make in a turn.
                menuString = BoardView.playerTurnMenu(gui,stringList);
                // The "if else" checks to see what String the previous button press from the menu returns.
                if(menuString.equals(stringList.get("buyPropertyMsg"))){
                    // Shows a message on the GUI depending on how much money the currentPlayer has
                    BoardView.buyPropertyView(BuyProperty.buyProperty(currentPlayer, owners, buildTilePrices, companyTilePrices), gui, stringList);
                    // Updates the gui_players balance to the same as the stored value in the players
                    PlayerView.updateBalances(gui_players,players);

                }else if(menuString.equals(stringList.get("buildOnPropertyMsg"))){
                    // Assigns an integer to buildingPosition to know where the player is building.
                    // The integer comes from buildingAvailability() and it makes a dropdown menu on the GUI to choose a property from
                    // If the player does not have all properties in any color group, a message will pop up telling the player.
                    // This integer is used in buildHouse.
                    // buildHouse() will take money from the currentPlayer and stores that a house has been built
                    int buildingPosition = BuildingsView.buildingAvailability(stringList,GUIBoardData.tilesGUIData(stringList), gui, players[currentPlayerNum], owners, propertyGroups);
                    boolean buildHouse = BuyHouse.buildHouse(buildTilePrices, currentPlayer, buildingPosition, owners);
                    PlayerView.updateBalances(gui_players,players);
                    // Returns a message depending on the buildHouse() returns true or not
                    BoardView.buyHouseView(buildHouse,gui,stringList);
                    // Makes the house appear on the GUI board
                    BuildingsView.updateBuildings(fields,owners);


                }else if(menuString.equals(stringList.get("sellOnPropertyMsg"))){
                    int sellBuildingPosition = PropertyOwnerView.sellHouseView(stringList,GUIBoardData.tilesGUIData(stringList),gui,players[currentPlayerNum],owners,propertyGroups);
                    SellProperty.sellHouse(buildTilePrices,currentPlayer,sellBuildingPosition,owners);
                    PlayerView.updateBalances(gui_players,players);
                    BuildingsView.updateBuildings(fields,owners);
                }else{
                    // This end the currentPlayers turn
                    break;
                }

                // Changes the border color of a property to the same color as the player owning it.
                PropertyOwnerView.updateBorderColor(fields,owners,PlayerColor.initPlayerColor());

            }
            // Checks for any bankrupt players so they will be skipped
            bankruptPlayers.updateBankruptPlayers(players);
            // The win screen with a button to close the game.
            if(EventsView.hasWon(bankruptPlayers, gui)){
                System.exit(0);
            }


        }
    }

}
