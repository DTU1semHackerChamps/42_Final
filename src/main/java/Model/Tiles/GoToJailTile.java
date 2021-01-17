package Model.Tiles;

import Model.Player.Player;

public class GoToJailTile extends Tile{

    public GoToJailTile(Player[] players) {
        super(players);
    }

    /**
     *This method sets the player-position to the prison, subtracts 4000 from the player's balance to cancel the money you get to cross start.
     * And it also sets the player's jailstatus to true to change how the Player is handled on the JailTile.
     */
    @Override
    public void executeTile(Player currentPlayer, int sumOfDice) {
       currentPlayer.setPosition(10);
       currentPlayer.setInJail(true);
       currentPlayer.addBalance(-4000);
    }
}
