package Model.Tiles;

import Model.Player;

public class TaxTile extends Tile{


    public TaxTile(Player currentPlayer, Player[] players) {
        super(currentPlayer, players);
    }

    @Override
    public void executeTile() {

        if (currentPlayer.getBalance() < 40000){

            int tenPercentOfBalance = (int) (currentPlayer.getBalance() * 0.1);
            currentPlayer.addBalance(-tenPercentOfBalance);

        } else currentPlayer.addBalance(-4000);

    }
}
