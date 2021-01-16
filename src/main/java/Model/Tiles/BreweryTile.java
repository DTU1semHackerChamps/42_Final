package Model.Tiles;

import Model.Player;
import Model.TileOwners;

public class BreweryTile extends OwnableTile {
    public BreweryTile(Player[] players, TileOwners owners) {
        super(players, owners);
    }


    /**
     * Checks the ownership of tile 12 and 28, and applies a multiplier if both or one of them
     * is owned by the same player. A dice roll is also taken into account in the rent.
     * The player pays the final result of the rent to the owning player.
     * @param currentPlayer The player landing on the tile
     * @param sumOfDice Sum of 2 dice rolls
     */
    @Override
    public void executeTile(Player currentPlayer, int sumOfDice) {
        int playerPosition = currentPlayer.getPosition();
        int currentPlayerNum = currentPlayer.getPlayerNum();
        int rent = 100;

        // Checks of there are any players owning the property
        if(owners.getTileOwner(playerPosition) != -1){
            // Checks that the player landing on the tile does not own the tile
            if (owners.getTileOwner(playerPosition) != currentPlayerNum) {
                int priceMultiply = 0;
                // Assigns the owner of the tile to the variable breweryOwner
                int breweryOwner = owners.getTileOwner(playerPosition);

                // One ups the multiplier if the owner owns tile 12 (Tuborg)
                if(owners.getTileOwner(12) == breweryOwner) {
                    priceMultiply++;
                }

                // One ups the multiplier if the owner owns tile 28 (Coca Cola)
                if(owners.getTileOwner(28) == breweryOwner) {
                    priceMultiply++;
                }

                // Calculates the final rent
                rent = rent * priceMultiply * sumOfDice;

                //Pays the owner money from the currentPlayer
                currentPlayer.addBalance(-rent);
                players[breweryOwner].addBalance(rent);

            }

        }

    }
}
