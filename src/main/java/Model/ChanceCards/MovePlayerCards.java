package Model.ChanceCards;

import Model.Player;

public class MovePlayerCards extends ChanceCard {
    private int moveAmount;

    public MovePlayerCards(Player[] players, String msgKeyWord, int moveAmount) {
        super(players, msgKeyWord);
        this.moveAmount = moveAmount;
    }

    @Override
    public String useChanceCard(Player currentPlayer) {
        this.currentPlayer.addPosition(moveAmount);

        return msgKeyWord;
    }


}
