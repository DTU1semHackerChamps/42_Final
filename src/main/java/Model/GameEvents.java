package Model;

public class GameEvents
{
    public static int whoWon(BankruptPlayers bankruptPlayers, PlayerNames names) {
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
}
