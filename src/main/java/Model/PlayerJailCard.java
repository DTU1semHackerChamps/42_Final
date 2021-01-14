package Model;

import View.PlayerView;

public class PlayerJailCard {
    static boolean [] hasJailCard;

    public PlayerJailCard(int numOfPlayer){
        hasJailCard = new boolean[numOfPlayer];
    }

    public static void addJailCard (int currentPlayerNum) {
        hasJailCard [currentPlayerNum-1] = true;

    }

    public static boolean[] getHasJailCard() {
        return hasJailCard;
    }




//    public static void main(String[] args) {
//        new PlayerJailCard(6);
//        PlayerJailCard.addJailCard(4);
//        PlayerJailCard.addJailCard(1);
//        PlayerJailCard.addJailCard(3);
//
//
//
//        for (int i = 0; i < 6; i++) {
//            System.out.println(PlayerJailCard.hasJailCard[i]);
//
//        }
//    }

//    public static boolean[] havePlayersJailCards (int numOfPlayer, int playerNumber){
//        boolean[] haveJailCards = new boolean[numOfPlayer];
//        haveJailCards[playerNumber] = true;
//        return haveJailCards;
//    }

}
