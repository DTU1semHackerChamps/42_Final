package Model.ChanceCards;

import Model.Player.Player;

public class MovePlayerCards extends ChanceCard {
    private int moveAmount;

    public MovePlayerCards(Player[] players, String msgKeyWord, int moveAmount) {
        super(players, msgKeyWord);
        this.moveAmount = moveAmount;
    }

    @Override
    public String useChanceCard(Player currentPlayer) {
        currentPlayer.addPosition(moveAmount);

        return msgKeyWord;
    }


}
