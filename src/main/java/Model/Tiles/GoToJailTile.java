package Model.Tiles;

import Controller.BoardController;
import Model.Player;

public class GoToJailTile extends Tile{

    public GoToJailTile(Player[] players) {
        super(players);
    }

    /**
     * This method sets the player-position to the prison...
     */
    @Override
    public void executeTile(Player currentPlayer) {
       currentPlayer.setPosition(10);
       currentPlayer.setIsInJail(true);
    }
}
