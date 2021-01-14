package Model.ChanceCards;

import Model.Player;

public class MovePlayerToCards extends ChanceCard{
    private int specificTile;

    public MovePlayerToCards(Player currentPlayer, Player[] players, int specificTile) {
        super(currentPlayer, players);
        this.specificTile = specificTile;
    }

    @Override
    public void useChancecard() {
        currentPlayer.setPosition(specificTile);
    }
}
