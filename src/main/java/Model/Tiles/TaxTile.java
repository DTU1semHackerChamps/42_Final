package Model.Tiles;

import Model.Player;

public class TaxTile extends Tile{


    public TaxTile(Player currentPlayer, Player[] players) {
        super(currentPlayer, players);
    }

    /**
     * This method is responsible for taking either 4000 thousand or 10 percent of the player's balance, depends on the player's balance.
     */
    @Override
    public void executeTile() {

        if (currentPlayer.getBalance() < 40000){

            int tenPercentOfBalance = (int) (currentPlayer.getBalance() * 0.10);
            currentPlayer.addBalance(-tenPercentOfBalance);

        } else currentPlayer.addBalance(-4000);

    }
}
