package Model.ChanceCards;

import Model.Player.Player;

public class GoToJailCards extends ChanceCard {
    public GoToJailCards(Player[] players, String msgKeyWord) {
        super(players, msgKeyWord);
    }

    @Override
    public String useChanceCard(Player currentPlayer) {
        currentPlayer.setInJail(true);
        currentPlayer.setPosition(10);
        currentPlayer.addBalance(-400);
        return msgKeyWord;
    }
}
