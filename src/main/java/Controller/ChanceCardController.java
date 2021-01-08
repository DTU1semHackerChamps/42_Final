package Controller;

import java.util.Random;

public class ChanceCardController {




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

    public static int drawCard(int index, ChanceCard[] chanceCards, Player currentPlayer){
        for (int i = 0; i < chanceCards.length; i++) {
            chanceCards[i].setCurrentPlayer(currentPlayer);
        }

        index++;

        chanceCards[index].useChanceCard();


        if(index > 20){
            index = 0;
        }

        return index;
    }

}
