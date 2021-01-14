package Controller;

import Model.*;
import Model.Tiles.BuildableTile;
import Model.Tiles.Tile;
import View.BoardView;
import View.BuildingsView;
import View.PlayerView;
import View.PropertyOwnerView;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.io.IOException;
import java.util.HashMap;

public class GameController {

    public static void main(String[] args) throws IOException {
        // loads the file of the corresponding language input string
        Dice dice1 = new Dice(0);
        Dice dice2 = new Dice(0);

        HashMap<String, String> stringList = Language.languageInit("Danish");
        GUI_Street[] fields = new GUI_Street[40];
        GUI gui = BoardView.initBoard(stringList, fields, GUIBoardData.tilesData(stringList), BuildableTilePrices.tilesData(), CompanyTilePrices.companyData());
        // Currentplayer is used to decide which player is rolling the dice and affected by the balance change, position change and extra turn
        Player[] players = Player.playerList(PlayerView.getNumberOfPlayers(gui, stringList));
        Player currentPlayer = new Player(0,0,false,0);
        BankruptPlayers bankruptPlayers = new BankruptPlayers(players);
        GUI_Player[] gui_players = PlayerView.displayAddPlayer(stringList, gui, fields, players);
        PropertyGroup[] propertyGroups = PropertyGroup.tileGroups();
        TileOwners owners = new TileOwners();
        BuildableTilePrices[] prices = BuildableTilePrices.tilesData();
        Tile[] tiles = TileController.boardTiles(prices,currentPlayer,players,owners,propertyGroups);
        int currentPlayerNum = players.length - 1;
        int sumOfDice;
        int position = 0;
        String menuString = "";
        while (true){
            currentPlayerNum = Player.switchPlayer(currentPlayerNum,players,bankruptPlayers);
            currentPlayer = players[currentPlayerNum];
            dice1.rollDice();
            dice2.rollDice();
            sumOfDice = dice1.getFaceValue() + dice2.getFaceValue();
            currentPlayer.addPosition(sumOfDice);
            position = currentPlayer.getPosition();
            tiles[position].executeTile();
            PlayerView.rollScreen(gui,stringList);
            PlayerView.displayDice(gui,dice1.getFaceValue(),dice2.getFaceValue());
            PlayerView.updateBalances(gui_players,players);
            PlayerView.updatePosition(fields, gui_players, players);
                owners.setTileOwner(1,1);
                owners.setTileOwner(3,1);
            while(true){
                menuString = BoardView.playerTurnMenu(gui,stringList);
                if(menuString.equals(stringList.get("buyPropertyMsg"))){

                    BoardView.buyPropertyView(BuyProperty.buyProperty(currentPlayer, owners, prices), gui, stringList);
                    PlayerView.updateBalances(gui_players,players);

                }else if(menuString.equals(stringList.get("buildOnPropertyMsg"))){
                    int buildingPosition = BuildingsView.buildingAvailability(stringList,GUIBoardData.tilesData(stringList), gui, players[currentPlayerNum], owners, propertyGroups);
                    boolean buildHouse = BuyHouse.buildHouse(prices, currentPlayer, buildingPosition, owners);
                    PlayerView.updateBalances(gui_players,players);
                    BoardView.buyHouseView(buildHouse,gui,stringList);


                }else {
                    break;
                }
                PropertyOwnerView.updateBorderColor(fields,owners,PlayerColor.initPlayerColor());
            }
            System.out.println(owners.getTileHouses(1));
            BuildingsView.updateBuildings(fields,owners);
            bankruptPlayers.updateBankruptPlayers(players);
            if(GameEvents.hasWon(bankruptPlayers, gui)){
                System.exit(0);
            }


        }
    }

}
