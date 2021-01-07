package Model.ChanceCards;

import gui_main.GUI;



public class ReceiveMoneyCards extends ChanceCard {
    private int balanceChange;

    public ReceiveMoneyCards(String cardDescription, Tile[] tiles, Player[] players, Player currentPlayer, GUI gui, int balanceChange) {
        super(cardDescription, tiles, players, currentPlayer, gui);
        this.balanceChange = balanceChange;
    }

    @Override
    public void useChanceCard() {
        gui.showMessage(cardDescription);
        currentPlayer.addBalance(balanceChange);
    }
}
