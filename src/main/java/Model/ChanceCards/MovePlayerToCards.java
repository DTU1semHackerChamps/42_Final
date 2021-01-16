package Model.ChanceCards;

import Model.Player;

public class MovePlayerToCards extends ChanceCard{
    private int specificTile;

    public MovePlayerToCards(Player[] players, String msgKeyWord, int specificTile) {
        super(players, msgKeyWord);
        this.specificTile = specificTile;
    }

    @Override
    public String useChanceCard(Player currentPlayer) {
        currentPlayer.setPosition(specificTile);
        return msgKeyWord;
    }
}
