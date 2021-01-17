package Model.ChanceCards;

import Model.Player.Player;

public abstract class ChanceCard {

    protected Player currentPlayer;
    protected Player[] players;
    protected String msgKeyWord;

    /**
     * This constructor is the inherited one that is used in all of the ChanceCards classes.
     * @param players all the players in the game.
     * @param msgKeyWord a keyword that refernces a specific string from the stringList Hashmap.
     */

    public ChanceCard(Player[] players, String msgKeyWord){
        this.players = players;
        this.msgKeyWord = msgKeyWord;
    }

    public abstract String useChanceCard(Player currentPlayer);

}
