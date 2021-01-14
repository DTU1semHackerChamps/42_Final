package Model.ChanceCards;

import Model.Player;

public class ReceiveMoneyCards extends ChanceCard{
    private int moneyAmount;

    public ReceiveMoneyCards(Player currentPlayer, Player[] players, int moneyAmount) {
        super(currentPlayer, players);
        this.moneyAmount = moneyAmount;
    }

    @Override
    public void useChancecard() {
        currentPlayer.addBalance(moneyAmount);
    }
}
