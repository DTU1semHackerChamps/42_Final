package Model;

import View.PlayerView;

public class PlayerJailCard {
    static boolean [] hasJailCard;

    public PlayerJailCard(int numOfPlayers){
        hasJailCard = new boolean[numOfPlayers];
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
//        System.out.println(PlayerJailCard.hasJailCard[1]);
//    }

//    public static boolean[] havePlayersJailCards (int numOfPlayer, int playerNumber){
//        boolean[] haveJailCards = new boolean[numOfPlayer];
//        haveJailCards[playerNumber] = true;
//        return haveJailCards;
//    }

}
