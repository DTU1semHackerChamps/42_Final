package Model.Tiles;

import Model.Player;
import Model.TileOwners;

public class BreweryTile extends OwnableTile {
    public BreweryTile(Player[] players, TileOwners owners) {
        super(players, owners);
    }

    @Override
    public void executeTile(Player currentPlayer, int sumOfDice) {
        int playerPosition = currentPlayer.getPosition();
        int currentPlayerNum = currentPlayer.getPlayerNum();
        int rent = 100;

        if(owners.getTileOwner(playerPosition) != -1){

            if (owners.getTileOwner(playerPosition) != currentPlayerNum) {
                int priceMultiply = 0;
                int breweryOwner = owners.getTileOwner(playerPosition);

                if(owners.getTileOwner(12) == breweryOwner) {
                    priceMultiply++;
                }

                if(owners.getTileOwner(28) == breweryOwner) {
                    priceMultiply++;
                }

                rent = rent * priceMultiply * sumOfDice;

                currentPlayer.addBalance(-rent);
                players[breweryOwner].addBalance(rent);

            }

        }

    }
}
