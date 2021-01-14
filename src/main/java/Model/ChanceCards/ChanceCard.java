package Model.ChanceCards;

import Model.Player;

public abstract class ChanceCard {

    protected Player currentPlayer;
    protected Player[] players;

    public ChanceCard(Player currentPlayer, Player[] players){
        this.currentPlayer = currentPlayer;
        this.players = players;
    }

    public abstract void useChancecard();

}
