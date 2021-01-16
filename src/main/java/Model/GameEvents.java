package Model;

import gui_main.GUI;

public class GameEvents
{
    /**
     * checks who went bankrupt and returns the last playing player
     * @param bankruptPlayers
     * @return the number of the winning player
     */
    public static int whoWon(BankruptPlayers bankruptPlayers) {
        int allPlayers = bankruptPlayers.getBankruptPlayers().length;
        int winningPlayerNum = -1;

        if(bankruptPlayers.numOfBankruptPlayers() == allPlayers - 1){
            for (int i = 0; i < allPlayers; i++) {
                if(!bankruptPlayers.getBankruptPlayers()[i]){
                    winningPlayerNum = i;

                }
            }
        }
        return winningPlayerNum;
    }

}
