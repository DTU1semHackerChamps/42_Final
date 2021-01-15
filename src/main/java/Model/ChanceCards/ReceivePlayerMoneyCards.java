package Model.ChanceCards;

import Model.Player;

public class ReceivePlayerMoneyCards extends ChanceCard{
    private int moneyFromPlayers;

    public ReceivePlayerMoneyCards(Player currentPlayer, Player[] players, String msgKeyWord, int moneyFromPlayer) {
        super(currentPlayer, players, msgKeyWord);
        this.moneyFromPlayers = moneyFromPlayer;
    }

    @Override
    public String useChanceCard() {
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
