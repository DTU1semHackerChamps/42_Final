package Model.Tiles;

import Model.Player;

public class TaxTile extends Tile{


    public TaxTile(Player currentPlayer, Player[] players) {
        super(currentPlayer, players);
    }

    @Override
    public void executeTile() {
        currentPlayer.addBalance(-2000);
    }
}
