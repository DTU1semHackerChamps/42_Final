package Model.Tiles;

import Model.Player;
import Model.TileOwners;

public class FerryTile extends OwnableTile {

    private int faceValue;

    public FerryTile(Player[] players, TileOwners owners) {
        super(players, owners);

    }


    @Override
    public void executeTile(Player currentPlayer) {
        int playerPosition = currentPlayer.getPosition();
        int currentPlayerNum = currentPlayer.getPlayerNum();
        int rent = 500;


        if(owners.getTileOwner(playerPosition) != -1){

            if (owners.getTileOwner(playerPosition) != currentPlayerNum) {
                int priceMultiply = 0;
                int ferryOwner = owners.getTileOwner(playerPosition);

                if(owners.getTileOwner(5) == ferryOwner) {
                    priceMultiply++;
                }

                if(owners.getTileOwner(15) == ferryOwner) {
                    priceMultiply++;
                }

                if(owners.getTileOwner(25) == ferryOwner) {
                    priceMultiply++;
                }

                if(owners.getTileOwner(35) == ferryOwner) {
                    priceMultiply++;
                }

                for (int i = 1; i < priceMultiply; i++) {
                    rent = rent*2;

                }

                currentPlayer.addBalance(-rent);

            }

        }

    }
}
