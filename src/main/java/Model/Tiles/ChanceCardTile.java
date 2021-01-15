package Model.Tiles;

import Controller.ChanceCardController;
import Model.ChanceCards.ChanceCard;
import Model.Player;

public class ChanceCardTile extends Tile{

    ChanceCard[] cardList;

    public ChanceCardTile(Player currentPlayer, Player[] players, ChanceCard[] cardList) {
        super(currentPlayer, players);
        this.cardList = cardList;

    }

    @Override
    public void executeTile() {
        cardList[0].useChanceCard();
        ChanceCardController.shiftDeckOfCards(cardList);

    }
}
