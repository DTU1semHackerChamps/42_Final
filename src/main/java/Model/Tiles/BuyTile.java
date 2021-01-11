package Model.Tiles;

import Model.TileOwners;
import Model.BuildableTilePrices;

public class BuyTile {

    public boolean buyTile(TileOwners owners, Player currentPlayer, BuildableTilePrices[] tilesData){
        boolean buyStatus = false;
        if(owners.getTileOwner(currentPlayer.getPosition) == 0){

            if(currentPlayer.getBalance() > tilesData[currentPlayer.getPosition].getPropertyPrice()){
                currentPlayer.addBalance(-tilesData[currentPlayer.getPosition].getPropertyPrice());
                buyStatus = true;
            }
        }
        return buyStatus;
    }
}
