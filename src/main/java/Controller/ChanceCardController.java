package Controller;

import Model.ChanceCards.*;
import Model.Player;

import java.util.Random;

public class ChanceCardController {

    public static ChanceCard[] cardArrayInit(Player[] players, Player currentPlayer){
        ChanceCard[] chanceCards = new ChanceCard[43];

        chanceCards[0] = new PayBankCards(currentPlayer, players, "chanceCard1Msg", 1000);
        chanceCards[1] = new PayBankCards(currentPlayer, players, "chanceCard2Msg", 300);
        chanceCards[2] = new PayBankCards(currentPlayer, players, "chanceCard3Msg", 200);
        chanceCards[3] = new PayBankCards(currentPlayer, players, "chanceCard4Msg", 3000);
        chanceCards[4] = new PayBankCards(currentPlayer, players, "chanceCard4Msg", 3000);
        chanceCards[5] = new PayBankCards(currentPlayer, players, "chanceCard5Msg", 1000);
        chanceCards[6] = new PayBankCards(currentPlayer, players, "chanceCard6Msg", 200);
        chanceCards[7] = new PayBankCards(currentPlayer, players, "chanceCard7Msg", 1000);
        chanceCards[8] = new PayBankCards(currentPlayer, players, "chanceCard8Msg", 200);
        chanceCards[9] = new PayBankCards(currentPlayer, players, "chanceCard9Msg", 2000);
        chanceCards[10] = new ReceiveMoneyCards(currentPlayer, players, "chanceCard10Msg", 500);
        chanceCards[11] = new ReceiveMoneyCards(currentPlayer, players, "chanceCard10Msg", 500);
        chanceCards[12] = new ReceiveMoneyCards(currentPlayer, players, "chanceCard11Msg", 1000);
        chanceCards[13] = new ReceiveMoneyCards(currentPlayer, players, "chanceCard11Msg", 1000);
        chanceCards[14] = new ReceiveMoneyCards(currentPlayer, players, "chanceCard11Msg", 1000);
        chanceCards[15] = new ReceiveMoneyCards(currentPlayer, players, "chanceCard12Msg", 3000);
        chanceCards[16] = new ReceiveMoneyCards(currentPlayer, players, "chanceCard13Msg", 1000);
        chanceCards[17] = new ReceiveMoneyCards(currentPlayer, players, "chanceCard14Msg", 1000);
        chanceCards[18] = new ReceiveMoneyCards(currentPlayer, players, "chanceCard15Msg", 1000);
        chanceCards[19] = new ReceiveMoneyCards(currentPlayer, players, "chanceCard15Msg", 1000);
        chanceCards[20] = new ReceiveMoneyCards(currentPlayer, players, "chanceCard16Msg", 1000);
        chanceCards[21] = new ReceiveMoneyCards(currentPlayer, players, "chanceCard17Msg", 200);
        chanceCards[22] = new ReceivePlayerMoneyCards(currentPlayer, players, "chanceCard18Msg", 200);;
        chanceCards[23] = new ReceivePlayerMoneyCards(currentPlayer, players, "chanceCard19Msg", 500);
        chanceCards[24] = new ReceivePlayerMoneyCards(currentPlayer, players, "chanceCard20Msg", 500);
        chanceCards[25] = new MovePlayerToCards(currentPlayer, players, "chanceCard21Msg", 0);
        chanceCards[26] = new MovePlayerToCards(currentPlayer, players, "chanceCard21Msg", 0);
        chanceCards[27] = new MovePlayerCards(currentPlayer, players, "chanceCard22Msg", 3);
        chanceCards[28] = new MovePlayerToCards(currentPlayer, players, "chanceCard23Msg", 11);
        chanceCards[29] = new MovePlayerToCards(currentPlayer, players, "chanceCard24Msg", 5);
        chanceCards[30] = new MovePlayerToCards(currentPlayer, players, "chanceCard25Msg", 24);
        chanceCards[31] = new MovePlayerToCards(currentPlayer, players, "chanceCard26Msg", 32);
        chanceCards[32] = new MovePlayerToCards(currentPlayer, players, "chanceCard27Msg", 19);
        chanceCards[33] = new MovePlayerToCards(currentPlayer, players, "chanceCard28Msg", 39);

        return chanceCards;
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
