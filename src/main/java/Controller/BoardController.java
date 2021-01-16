package Controller;

import Model.*;
import Model.ChanceCards.ChanceCard;
import Model.Tiles.*;
import gui_main.GUI;

import java.util.HashMap;


public class BoardController {



    public static Tile[] boardTiles(BuildableTilePrices[] prices, Player currentPlayer, Player[] players, TileOwners owners, PropertyGroup[] propertyGroups, ChanceCard[] cardList, GUI gui, HashMap<String,String> stringList){
        Tile[] boardTiles = new Tile[40];

        boardTiles[0] = new StartTile(players);
        boardTiles[1] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[2] = new ChanceCardTile(players, cardList, gui, stringList);
        boardTiles[3] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[4] = new TaxTile(players);
        boardTiles[5] = new FerryTile(players,owners);
        boardTiles[6] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[7] = new ChanceCardTile(players, cardList, gui, stringList);
        boardTiles[8] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[9] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[10] = new JailTile(players);
        boardTiles[11] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[12] = new BreweryTile(players,owners);
        boardTiles[13] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[14] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[15] = new FerryTile(players,owners);
        boardTiles[16] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[17] = new ChanceCardTile(players, cardList, gui, stringList);
        boardTiles[18] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[19] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[20] = new ParkingTile(players);
        boardTiles[21] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[22] = new ChanceCardTile(players, cardList, gui, stringList);
        boardTiles[23] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[24] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[25] = new FerryTile(players,owners);
        boardTiles[26] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[27] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[28] = new BreweryTile(players,owners);
        boardTiles[29] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[30] = new GoToJailTile(players);
        boardTiles[31] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[32] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[33] = new ChanceCardTile(players, cardList, gui, stringList);
        boardTiles[34] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[35] = new FerryTile(players,owners);
        boardTiles[36] = new ChanceCardTile(players, cardList, gui, stringList);
        boardTiles[37] = new BuildableTile(players, owners, prices,propertyGroups);
        boardTiles[38] = new TaxTile(players);
        boardTiles[39] = new BuildableTile(players, owners, prices,propertyGroups);

        return boardTiles;
    }




}
