package Model.ChanceCards;

import Model.Player;

public class MovePlayerToCards extends ChanceCard{
    private int specificTile;

    public MovePlayerToCards(Player currentPlayer, Player[] players, String msgKeyWord, int specificTile) {
        super(currentPlayer, players, msgKeyWord);
        this.specificTile = specificTile;
    }

    @Override
    public String useChancecard() {
        currentPlayer.setPosition(specificTile);

        return msgKeyWord;
    }
}
