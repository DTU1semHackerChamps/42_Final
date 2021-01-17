package Model.Tiles;

import Model.Player.Player;

public class JailTile extends Tile{

    public JailTile(Player[] players) {
        super(players);
    }

    /**
     * This method is used to subtract money from the player if its JailStatus is true.
     * @param currentPlayer the player who's turn it is.
     * @param sumOfDice used in this method to so that the tile only has an effect if it is -1.
     */

    @Override
    public void executeTile(Player currentPlayer, int sumOfDice) {
        if(sumOfDice == -1) {
            //if the player is in jail it checks if the player has a jail card if not 1000 is subtracted from the players balance.
            if (currentPlayer.isInJail()) {
                if (!currentPlayer.isJailCard()) {
                    currentPlayer.addBalance(-1000);
                } else {
                    currentPlayer.setJailCard(false);
                }
                currentPlayer.setInJail(false);
            }
        }
    }
}
