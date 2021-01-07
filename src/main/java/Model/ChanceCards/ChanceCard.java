package Model.ChanceCards;

import gui_main.GUI;
import Model.Player;
import Controller.TileController;

public abstract class ChanceCard {
    protected String cardDescription;
    protected Tile[] tiles;
    protected Player[] players;
    protected Player currentPlayer;
    protected GUI gui;

    public ChanceCard(String cardDescription, Tile[] tiles, Player[] players, Player currentPlayer, GUI gui) {
        this.tiles = tiles;
        this.cardDescription = cardDescription;
        this.players = players;
        this.currentPlayer = currentPlayer;
        this.gui = gui;
    }

    public abstract void useChanceCard();

    public abstract void setCurrentPlayer(Player currentPlayer);
}
