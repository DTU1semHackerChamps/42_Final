package Model.Tiles;

import Controller.BoardController;
import Model.Player;

public class GoToJailTile extends Tile{

    public GoToJailTile(Player currentPlayer, Player[] players) {
        super(currentPlayer, players);
    }

    /**
     * This method sets the player-position to the prison...
     */
    @Override
    public void executeTile() {
       currentPlayer.setPosition(10);
       currentPlayer.setIsInJail(true);
    }
}
