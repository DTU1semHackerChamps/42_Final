package Model.Tiles;

import Controller.TileController;
import Model.Player;

public class GoToJailTile extends Tile{

    public GoToJailTile(Player currentPlayer, Player[] players) {
        super(currentPlayer, players);
    }

    @Override
    public void executeTile() {
       currentPlayer.setPosition(10);
    }
}
