package Model.ChanceCards;

import Model.Player.Player;

public class ReceiveMoneyCards extends ChanceCard{
    private int moneyAmount;

    /**
     * This constuctor also uses the int moneyAmount.
     * @param players
     * @param msgKeyWord
     * @param moneyAmount
     */
    public ReceiveMoneyCards(Player[] players, String msgKeyWord, int moneyAmount) {
        super(players, msgKeyWord);
        this.moneyAmount = moneyAmount;
    }

    /**
     * This method adds the money omunt to the players balance.
     * @param currentPlayer
     * @return
     */

    @Override
    public String useChanceCard(Player currentPlayer) {
        currentPlayer.addBalance(moneyAmount);

        return msgKeyWord;
    }
}
