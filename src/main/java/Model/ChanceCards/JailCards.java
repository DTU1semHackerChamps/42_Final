package Model.ChanceCards;
import gui_main.GUI;
import Model.Player;
import Controller.TileController;

public class JailCards extends ChanceCard {

    public JailCard(String cardDescription, Tile[] tiles, Player[] players, Player currentPlayer, GUI gui) {
        super(cardDescription, tiles, players, currentPlayer, gui);
    }

    @Override
    public void useChanceCard() {
        gui.showMessage(cardDescription);
        currentPlayer.setJailCard(true);
    }

    @Override
    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }


}