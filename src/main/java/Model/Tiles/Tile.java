package Model.Tiles;

import Model.Player;

public abstract class Tile {
    protected Player[] players;
    protected Player currentPlayer;

    public Tile(Player[] players){
        this.players = players;
    }

    public abstract void executeTile(Player currentPlayer, int sumOfDice);
}
