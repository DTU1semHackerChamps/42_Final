package Model.Tiles;

import Model.Player.Player;
import Model.TileOwners;

public class FerryTile extends OwnableTile {

    private int faceValue;

    public FerryTile(Player[] players, TileOwners owners) {
        super(players, owners);

    }

    /**
     * Checks the ownership of all the ferry tiles and makes the current player pay the owner
     * an amount base on how many ferry tiles the owner owns.
     * The rent starts with 500kr for one owned tile and multiplies exponentially
     * @param currentPlayer The player landing on the tile
     * @param sumOfDice Sum of 2 dice rolls
     */

    @Override
    public void executeTile(Player currentPlayer, int sumOfDice) {
        int playerPosition = currentPlayer.getPosition();
        int currentPlayerNum = currentPlayer.getPlayerNum();
        int rent = 500;

        // Checks of there are any players owning the property
        if(owners.getTileOwner(playerPosition) != -1){
            // Checks that the player landing on the tile does not own the tile
            if (owners.getTileOwner(playerPosition) != currentPlayerNum) {
                int priceMultiply = 0;
                // Assigns the owner of the tile to the variable ferryOwner
                int ferryOwner = owners.getTileOwner(playerPosition);

                // One ups the multiplier if the owner owns any other ferry tile (tile 5, 15, 25 or 35)
                for (int i = 5; i <= 35; i += 5) {
                    if(owners.getTileOwner(i) == ferryOwner) {
                        priceMultiply++;
                    }
                }

                // Calculates the final rent
                for (int i = 1; i < priceMultiply; i++) {
                    rent = rent*2;

                }

                //Pays the owner money from the currentPlayer
                currentPlayer.addBalance(-rent);
                players[ferryOwner].addBalance(rent);

            }

        }

    }
}
