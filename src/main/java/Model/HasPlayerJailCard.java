package Model;

import View.PlayerView;

public class HasPlayerJailCard {

    public static boolean[] havePlayersJailCards (int numOfPlayer, int playerNumber){
        boolean[] haveJailCards = new boolean[numOfPlayer];
        haveJailCards[playerNumber] = true;
        return haveJailCards;
    }

}
