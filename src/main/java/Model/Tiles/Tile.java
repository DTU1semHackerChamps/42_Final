package Model.Tiles;

import Model.Player;

public abstract class Tile {
    protected Player[] players;
    protected Player currentPlayer;

    public Tile(Player currentPlayer, Player[] players){
        this.players = players;
        this.currentPlayer = currentPlayer;
    }

    public abstract void executeTile();
}
