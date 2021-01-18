package Model.ChanceCards;

import Model.Player.Player;

public class JailCards extends ChanceCard {
    public JailCards(Player[] players, String msgKeyWord) {
        super(players, msgKeyWord);
    }


    /**
     * Gives the current Player a get out of jail free card.
     * @param currentPlayer the player whose turn it is.
     * @return the keyword string referencing the chanceCard text.
     */
    @Override
    public String useChanceCard(Player currentPlayer) {
        currentPlayer.setJailCard(true) ;
        return msgKeyWord;
    }

}
