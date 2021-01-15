package Controller;

import Model.BuildableTilePrices;
import Model.ChanceCards.ChanceCard;
import Model.Player;
import Model.PropertyGroup;
import Model.TileOwners;
import Model.Tiles.*;

public class BoardController {

    public static Tile[] boardTiles(BuildableTilePrices[] prices, Player currentPlayer, Player[] players, TileOwners owners, PropertyGroup[] propertyGroups, ChanceCard[] cardList){
        Tile[] boardTiles = new Tile[40];

        boardTiles[0] = new StartTile(currentPlayer,players);
        boardTiles[1] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[2] = new ChanceCardTile(currentPlayer, players, cardList);
        boardTiles[3] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[4] = new TaxTile(currentPlayer,players);
        boardTiles[5] = new FerryTile(currentPlayer,players,owners);
        boardTiles[6] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[7] = new ChanceCardTile(currentPlayer, players, cardList);
        boardTiles[8] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[9] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[10] = new JailTile(currentPlayer, players);
        boardTiles[11] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[12] = new BreweryTile(currentPlayer,players,owners);
        boardTiles[13] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[14] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[15] = new FerryTile(currentPlayer,players,owners);
        boardTiles[16] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[17] = new ChanceCardTile(currentPlayer, players, cardList);
        boardTiles[18] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[19] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[20] = new ParkingTile(currentPlayer, players);
        boardTiles[21] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[22] = new ChanceCardTile(currentPlayer, players, cardList);
        boardTiles[23] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[24] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[25] = new FerryTile(currentPlayer,players,owners);
        boardTiles[26] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[27] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[28] = new BreweryTile(currentPlayer,players,owners);
        boardTiles[29] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[30] = new GoToJailTile(currentPlayer, players);
        boardTiles[31] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[32] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[33] = new ChanceCardTile(currentPlayer, players, cardList);
        boardTiles[34] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[35] = new FerryTile(currentPlayer,players,owners);
        boardTiles[36] = new ChanceCardTile(currentPlayer, players, cardList);
        boardTiles[37] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);
        boardTiles[38] = new TaxTile(currentPlayer,players);
        boardTiles[39] = new BuildableTile(currentPlayer, players, owners, prices,propertyGroups);

        return boardTiles;
    }




}
