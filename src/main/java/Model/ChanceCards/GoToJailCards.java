package Model.ChanceCards;

import Model.Player.Player;

public class GoToJailCards extends ChanceCard {
    public GoToJailCards(Player[] players, String msgKeyWord) {
        super(players, msgKeyWord);
    }

    /**
     * This function puts the user in jail and it takes into account that the player should not get money if it moves past the start tile.
     * @param currentPlayer the player whose turn it is.
     * @return the keyword string referencing the chanceCard text.
     */
    @Override
    public String useChanceCard(Player currentPlayer) {
        currentPlayer.setInJail(true);
        currentPlayer.setPosition(10);

        //exception for if the person draws the chancecard between start tile and jail tile.
        if(currentPlayer.getPosition() > 10){
            currentPlayer.addBalance(-4000);
        }
        return msgKeyWord;
    }
}
