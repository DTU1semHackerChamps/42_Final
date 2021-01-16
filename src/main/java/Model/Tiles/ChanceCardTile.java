package Model.Tiles;

import Controller.ChanceCardController;
import Model.ChanceCards.ChanceCard;
import Model.Player;
import View.EventsView;
import gui_main.GUI;

import java.util.HashMap;

public class ChanceCardTile extends Tile{

    ChanceCard[] cardList;
    GUI gui;
    HashMap<String,String> stringList;

    public ChanceCardTile( Player[] players, ChanceCard[] cardList,GUI gui, HashMap<String,String> stringList) {
        super(players);
        this.cardList = cardList;
        this.gui = gui;
        this.stringList = stringList;

    }

    @Override
    public void executeTile(Player currentPlayer, int sumOfDice) {
        String chanceCardKeyword = cardList[0].useChanceCard(currentPlayer);
        ChanceCardController.shiftDeckOfCards(cardList);
        EventsView.chanceCardMsg(chanceCardKeyword, gui, stringList);


    }
}
