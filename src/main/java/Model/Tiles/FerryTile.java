package Model.Tiles;

import Model.Player;
import Model.TileOwners;

public class FerryTile extends OwnableTile {

    private int faceValue;

    public FerryTile(Player[] players, TileOwners owners) {
        super(players, owners);

    }


    @Override
    public void executeTile(Player currentPlayer, int sumOfDice) {
        int playerPosition = currentPlayer.getPosition();
        int currentPlayerNum = currentPlayer.getPlayerNum();
        int rent = 500;


        if(owners.getTileOwner(playerPosition) != -1){

            if (owners.getTileOwner(playerPosition) != currentPlayerNum) {
                int priceMultiply = 0;
                int ferryOwner = owners.getTileOwner(playerPosition);

                for (int i = 5; i <= 35; i += 5) {
                    if(owners.getTileOwner(i) == ferryOwner) {
                        priceMultiply++;
                    }
                }

                for (int i = 1; i < priceMultiply; i++) {
                    rent = rent*2;

                }

                currentPlayer.addBalance(-rent);
                players[ferryOwner].addBalance(rent);

            }

        }

    }
}
