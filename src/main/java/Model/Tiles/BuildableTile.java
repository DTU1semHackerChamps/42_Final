package Model.Tiles;

import Model.Player;
import Model.TileOwners;
import Model.BuildableTilePrices;

public class BuildableTile extends OwnableTile {

    private BuildableTilePrices[]  tilesData;

    public BuildableTile(Player currentPlayer, Player[] players, TileOwners owners, BuildableTilePrices[] tilesData) {
        super(currentPlayer, players, owners);
        this.tilesData = tilesData;
    }

    @Override
    public void executeTile() {
        int position = currentPlayer.getPosition();
        int owner = owners.getTileOwner(position);
        int houses = owners.getTileHouses(position);
        int hotel = owners.getTileHotel(position);
        BuildableTilePrices buildData = tilesData[position];
        int[] priceStage = BuildableTilePrices.rentPrice(position,tilesData);

        if((owner != currentPlayer.getPlayerNum()) && (owner != 0)){
           if(hotel != 1){
                   currentPlayer.addBalance(-priceStage[houses]);
               } else {
                   currentPlayer.addBalance(-priceStage[5]);
               }
           }

        }
    }
}
