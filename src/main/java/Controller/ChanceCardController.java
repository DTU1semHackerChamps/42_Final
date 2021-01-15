package Controller;

import Model.ChanceCards.*;
import Model.Player;

import java.util.Random;

public class ChanceCardController {

    private Player currentPlayer;

    public ChanceCardController(Player currentPlayer){
        this.currentPlayer = currentPlayer;

    }

    public static ChanceCard[] cardArrayInit(Player currentPlayer,Player[] players){
        ChanceCard[] chanceCards = new ChanceCard[34];

        chanceCards[0] = new PayBankCards(players, "chanceCard1Msg", 1000);
        chanceCards[1] = new PayBankCards(players, "chanceCard2Msg", 300);
        chanceCards[2] = new PayBankCards(players, "chanceCard3Msg", 200);
        chanceCards[3] = new PayBankCards(players, "chanceCard4Msg", 3000);
        chanceCards[4] = new PayBankCards(players, "chanceCard4Msg", 3000);
        chanceCards[5] = new PayBankCards(players, "chanceCard5Msg", 1000);
        chanceCards[6] = new PayBankCards(players, "chanceCard6Msg", 200);
        chanceCards[7] = new PayBankCards(players, "chanceCard7Msg", 1000);
        chanceCards[8] = new PayBankCards(players, "chanceCard8Msg", 200);
        chanceCards[9] = new PayBankCards(players, "chanceCard9Msg", 2000);
        chanceCards[10] = new ReceiveMoneyCards(players, "chanceCard10Msg", 500);
        chanceCards[11] = new ReceiveMoneyCards(players, "chanceCard10Msg", 500);
        chanceCards[12] = new ReceiveMoneyCards(players, "chanceCard11Msg", 1000);
        chanceCards[13] = new ReceiveMoneyCards(players, "chanceCard11Msg", 1000);
        chanceCards[14] = new ReceiveMoneyCards(players, "chanceCard11Msg", 1000);
        chanceCards[15] = new ReceiveMoneyCards(players, "chanceCard12Msg", 3000);
        chanceCards[16] = new ReceiveMoneyCards(players, "chanceCard13Msg", 1000);
        chanceCards[17] = new ReceiveMoneyCards(players, "chanceCard14Msg", 1000);
        chanceCards[18] = new ReceiveMoneyCards(players, "chanceCard15Msg", 1000);
        chanceCards[19] = new ReceiveMoneyCards(players, "chanceCard15Msg", 1000);
        chanceCards[20] = new ReceiveMoneyCards(players, "chanceCard16Msg", 1000);
        chanceCards[21] = new ReceiveMoneyCards(players, "chanceCard17Msg", 200);
        chanceCards[22] = new ReceivePlayerMoneyCards(players, "chanceCard18Msg", 200);;
        chanceCards[23] = new ReceivePlayerMoneyCards(players, "chanceCard19Msg", 500);
        chanceCards[24] = new ReceivePlayerMoneyCards(players, "chanceCard20Msg", 500);
        chanceCards[25] = new MovePlayerToCards(players, "chanceCard21Msg", 0);
        chanceCards[26] = new MovePlayerToCards(players, "chanceCard21Msg", 0);
        chanceCards[27] = new MovePlayerCards(players, "chanceCard22Msg", 3);
        chanceCards[28] = new MovePlayerToCards(players, "chanceCard23Msg", 11);
        chanceCards[29] = new MovePlayerToCards(players, "chanceCard24Msg", 5);
        chanceCards[30] = new MovePlayerToCards(players, "chanceCard25Msg", 24);
        chanceCards[31] = new MovePlayerToCards(players, "chanceCard26Msg", 32);
        chanceCards[32] = new MovePlayerToCards(players, "chanceCard27Msg", 19);
        chanceCards[33] = new MovePlayerToCards(players, "chanceCard28Msg", 39);

        return chanceCards;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    /**
     * Shuffles the deck of cards. According to Fisher–Yates shuffle array function.
     * "https://stackoverflow.com/questions/1519736/random-shuffling-of-an-array" from user Dan Bray.
     * @param cardList Array of chance cards
     */
    public static void cardShuffle(ChanceCard[] cardList){

        int index;
        ChanceCard temp;
        Random random = new Random();
        for (int i = cardList.length - 1; i >= 0; i--)
        {
            index = random.nextInt(i+1);
            temp = cardList[index];
            cardList[index] = cardList[i];
            cardList[i] = temp;
            System.out.println(cardList[i]);
        }

    }

    /**
     * Last chanceCard is placed first in array and the rest of the array is shifted one index up.
     * @param chanceCards An already initalised array of chanceCards.
     */
    public static void shiftDeckOfCards(ChanceCard[] chanceCards){

        int length = chanceCards.length;
        ChanceCard[] tempChanceCards = chanceCards;

        for(int i = 0; i < length; i++){

            if(i == 0){
                chanceCards[i] = tempChanceCards[length - 1];
            }

            if(i < length - 1){
                chanceCards[i + 1] = tempChanceCards[i];
            }
        }
    }
}
