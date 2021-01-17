package Model.Tiles;

import Controller.ChanceCardController;
import Model.ChanceCards.ChanceCard;
import Model.Player.Player;
import View.EventsView;
import gui_main.GUI;

import java.util.HashMap;

public class ChanceCardTile extends Tile{

    ChanceCard[] cardList;
    GUI gui;
    HashMap<String,String> stringList;

    /**
     * This constructor is used in case the tile should be a chanceCard tile.
     * @param players array of all the players in the game.
     * @param cardList array of all the chanceCards.
     * @param gui
     * @param stringList hashmap used to get the string that is displayed in the gui.
     */
    public ChanceCardTile( Player[] players, ChanceCard[] cardList,GUI gui, HashMap<String,String> stringList) {
        super(players);
        this.cardList = cardList;
        this.gui = gui;
        this.stringList = stringList;

    }

    /**
     * This method draws a chancecard, shifts the chance card deck by 1, and shows the used chanceCard description in the gui.
     * @param currentPlayer the player whose turn it is.
     * @param sumOfDice does nothing in this method.
     */

    @Override
    public void executeTile(Player currentPlayer, int sumOfDice) {
        //the chanceCard at at cardList index 0 is used.
        String chanceCardKeyword = cardList[0].useChanceCard(currentPlayer);
        //cardList is shifted by one to put a new chanceCard at cardList index 0
        ChanceCardController.shiftDeckOfCards(cardList);
        //the corresponding message of the chanceCard is used.
        EventsView.chanceCardMsg(chanceCardKeyword, gui, stringList);


    }
}
