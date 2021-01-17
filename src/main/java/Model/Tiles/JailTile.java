package Model.Tiles;

import Model.Player.Player;

public class JailTile extends Tile{

    public JailTile(Player[] players) {
        super(players);
    }

    @Override
    public void executeTile(Player currentPlayer, int sumOfDice) {
        if(sumOfDice == -1) {
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
