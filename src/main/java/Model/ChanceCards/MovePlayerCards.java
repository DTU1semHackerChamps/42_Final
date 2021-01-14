package Model.ChanceCards;

import Model.Player;

public class MovePlayerCards extends ChanceCard {
    private int moveAmount;

    public MovePlayerCards(Player currentPlayer, Player[] players, int moveAmount) {
        super(currentPlayer, players);
        this.moveAmount = moveAmount;
    }

    @Override
    public void useChancecard() {
        currentPlayer.addPosition(moveAmount);


    }


}
