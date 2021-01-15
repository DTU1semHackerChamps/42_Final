package Model.ChanceCards;

import Model.Player;

public class PayBankCards extends ChanceCard {
    private int moneyAmount;

    public PayBankCards(Player currentPlayer, Player[] players, String msgKeyWord, int moneyAmount) {
        super(currentPlayer, players, msgKeyWord);
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String useChanceCard() {
        currentPlayer.addBalance(-moneyAmount);

        return msgKeyWord;
    }
}
