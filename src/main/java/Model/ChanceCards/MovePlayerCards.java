package Model.ChanceCards;

import Model.Player.Player;

public class MovePlayerCards extends ChanceCard {
    private int moveAmount;

    /**
     * Also takes an input of the amount that the player should be moved.
     * @param players
     * @param msgKeyWord
     * @param moveAmount integer that will add to the players current position.
     */

    public MovePlayerCards(Player[] players, String msgKeyWord, int moveAmount) {
        super(players, msgKeyWord);
        this.moveAmount = moveAmount;
    }

    /**
     * This chanceCard makes the player move a specific amount of tiles.
     * @param currentPlayer the player whose turn it is.
     * @return the keyword string referencing the chanceCard text.
     */
    @Override
    public String useChanceCard(Player currentPlayer) {
        currentPlayer.addPosition(moveAmount);

        return msgKeyWord;
    }


}
