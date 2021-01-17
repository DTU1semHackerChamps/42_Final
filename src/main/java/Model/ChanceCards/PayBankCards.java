package Model.ChanceCards;

import Model.Player.Player;

public class PayBankCards extends ChanceCard {
    private int moneyAmount;

    public PayBankCards(Player[] players, String msgKeyWord, int moneyAmount) {
        super(players, msgKeyWord);
        this.moneyAmount = moneyAmount;
    }

    @Override
    public String useChanceCard(Player currentPlayer) {
        currentPlayer.addBalance(-moneyAmount);

        return msgKeyWord;
    }
}
