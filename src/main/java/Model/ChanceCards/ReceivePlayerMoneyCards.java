package Model.ChanceCards;

import Model.Player;

public class ReceivePlayerMoneyCards extends ChanceCard{
    private int moneyFromPlayers;

    public ReceivePlayerMoneyCards(Player[] players, String msgKeyWord, int moneyFromPlayer) {
        super(players, msgKeyWord);
        this.moneyFromPlayers = moneyFromPlayer;
    }

    @Override
    public String useChanceCard(Player currentPlayer) {
        int totalPlayersGiving = 0;
        int recievingMoneyAmount;
        for (int i = 0; i < players.length; i++) {
            if(this.currentPlayer.getPlayerNum() != i){
                players[i].addBalance(-moneyFromPlayers);
                totalPlayersGiving++;
            }

        }
        recievingMoneyAmount = moneyFromPlayers * totalPlayersGiving;
        this.currentPlayer.addBalance(recievingMoneyAmount);

        return msgKeyWord;
    }

}
