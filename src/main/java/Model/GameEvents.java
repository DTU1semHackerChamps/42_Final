package Model;

import gui_main.GUI;

public class GameEvents
{
    public static int whoWon(BankruptPlayers bankruptPlayers) {
        int allPlayers = bankruptPlayers.getBankruptPlayers().length;
        int winningPlayerNum = -1;

        if(bankruptPlayers.numOfBankruptPlayers() == allPlayers - 1){
            for (int i = 0; i < allPlayers; i++) {
                if(bankruptPlayers.getBankruptPlayers()[i]){
                    winningPlayerNum = i;

                }
            }
        }
        return winningPlayerNum;
    }

    public static boolean hasWon(Player[] players, BankruptPlayers bankruptPlayers, GUI gui){
        boolean endGame = false;
        int i = whoWon(bankruptPlayers);
        if(i != -1) {
            gui.showMessage("Spiller" + i);
            endGame = true;
        }
        return endGame;
    }

}
