package Model.ChanceCards;

import Model.Player.Player;

public class ReceivePlayerMoneyCards extends ChanceCard{
    private int moneyFromPlayers;

    /**
     * This constructor also uses the int moneyFromPlayers.
     * @param players
     * @param msgKeyWord
     * @param moneyFromPlayer
     */
    public ReceivePlayerMoneyCards(Player[] players, String msgKeyWord, int moneyFromPlayer) {
        super(players, msgKeyWord);
        this.moneyFromPlayers = moneyFromPlayer;
    }

    /**
     * This method uses the int money amount to subtract from the other players and adds the total amount to the currentPlayer.
     * @param currentPlayer
     * @return
     */
    @Override
    public String useChanceCard(Player currentPlayer) {
        int totalPlayersGiving = 0;
        int recievingMoneyAmount;
        for (int i = 0; i < players.length; i++) {
            if(currentPlayer.getPlayerNum() != i){
                players[i].addBalance(-moneyFromPlayers);
                totalPlayersGiving++;
            }

        }
        recievingMoneyAmount = moneyFromPlayers * totalPlayersGiving;
        currentPlayer.addBalance(recievingMoneyAmount);

        return msgKeyWord;
    }

}
