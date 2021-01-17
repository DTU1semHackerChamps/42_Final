package Model.ChanceCards;

import Model.Player.Player;

public class MovePlayerToCards extends ChanceCard{
    private int specificTile;

    /**
     * This constructor also takes the input of the specific tile that a player should be moved too.
     * @param players array of players in the game.
     * @param msgKeyWord the keyword string referencing the chanceCard text.
     * @param specificTile the specific tile that the player should be moved to.
     */

    public MovePlayerToCards(Player[] players, String msgKeyWord, int specificTile) {
        super(players, msgKeyWord);
        this.specificTile = specificTile;
    }


    /**
     * This method moves te currentPlayer to the the specificTile position.
     * @param currentPlayer
     * @return
     */
    @Override
    public String useChanceCard(Player currentPlayer) {
        currentPlayer.setPosition(specificTile);
        return msgKeyWord;
    }
}
