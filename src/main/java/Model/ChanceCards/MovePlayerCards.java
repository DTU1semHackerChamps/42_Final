package Model.ChanceCards;

import Model.Player;

public class MovePlayerCards extends ChanceCard {
    private int moveAmount;

    public MovePlayerCards(Player currentPlayer, Player[] players, String msgKeyWord, int moveAmount) {
        super(currentPlayer, players, msgKeyWord);
        this.moveAmount = moveAmount;
    }

    @Override
    public String useChanceCard() {
        currentPlayer.addPosition(moveAmount);

        return msgKeyWord;
    }


}
