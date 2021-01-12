package Model;

public class BankruptPlayers {
    private boolean [] bankruptPlayers;
    public BankruptPlayers(Player[] players){ this.bankruptPlayers = new boolean[players.length]; }

    public int numOfBankruptPlayers(){
        int numOfBankruptPlayers = 0;
        for (int i = 0; i < bankruptPlayers.length; i++) {
            if(bankruptPlayers[i]){
                numOfBankruptPlayers++;
            }
        }
    return numOfBankruptPlayers;
    }

    public void setBankruptPlayer(boolean isBankrupt, int numOfPlayer){
        bankruptPlayers[numOfPlayer] = isBankrupt;
    }

    public void updateBankruptPlayers(Player[] players){
        for (int i = 0; i < players.length; i++) {
            if (players[i].getBalance() <= 0){
                bankruptPlayers[i] = true;
            }
        }
    }
}
