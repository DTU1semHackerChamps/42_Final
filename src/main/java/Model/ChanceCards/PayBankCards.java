package Model.ChanceCards;

import Model.Player.Player;

public class PayBankCards extends ChanceCard {
    private int moneyAmount;

    /**
     * This constructor also use the int money amount.
     * @param players
     * @param msgKeyWord
     * @param moneyAmount
     */
    public PayBankCards(Player[] players, String msgKeyWord, int moneyAmount) {
        super(players, msgKeyWord);
        this.moneyAmount = moneyAmount;
    }

    /**
     * This method subtracts the moneyAmount from the players balance.
     * @param currentPlayer
     * @return
     */
    @Override
    public String useChanceCard(Player currentPlayer) {
        currentPlayer.addBalance(-moneyAmount);

        return msgKeyWord;
    }
}
