package Model.ChanceCards;

import Model.Player;

public class JailCards extends ChanceCard {
    public JailCards(Player[] players, String msgKeyWord) {
        super(players, msgKeyWord);
    }

    @Override
    public String useChanceCard(Player currentPlayer) {
        currentPlayer.setJailCard(true);
        return msgKeyWord;
    }
}
