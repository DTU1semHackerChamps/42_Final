package Model.ChanceCards;

import Model.Player;

public class ReceiveMoneyCards extends ChanceCard{
    private int moneyAmount;

    public ReceiveMoneyCards(Player[] players, String msgKeyWord, int moneyAmount) {
        super(players, msgKeyWord);
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String useChanceCard(Player currentPlayer) {
        currentPlayer.addBalance(moneyAmount);

        return msgKeyWord;
    }
}
