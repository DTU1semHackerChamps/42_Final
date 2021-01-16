package Model.Tiles;

import Model.Player;

public class GoToJailTile extends Tile{

    public GoToJailTile(Player[] players) {
        super(players);
    }

    /**
     * This method sets the player-position to the prison...
     */
    @Override
    public void executeTile(Player currentPlayer, int sumOfDice) {
       currentPlayer.setPosition(10);
       currentPlayer.setInJail(true);
       currentPlayer.addBalance(-4000);
    }
}
