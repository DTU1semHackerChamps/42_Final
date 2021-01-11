package Model;


public class Player {
    private int balance;
    private int position;

    private boolean jailCard;
    private int playerNum;



    public Player(int balance, int position, boolean jailCard,int playerNum){

        this.balance = balance;
        this.position = position;
        this.jailCard = jailCard;
        this.playerNum = playerNum;

    }

    public static Player[] playersInit(int numOfPlayers) {
        Player[] players = new Player[numOfPlayers];

        for (int i = 0; i < numOfPlayers; i++) {
            players[i] = new Player(15000, 0, false, i+1);

        }
        return players;
    }



    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }


    public boolean isJailCard() {
        return jailCard;
    }

    public void setJailCard(boolean jailCard) {
        this.jailCard = jailCard;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }
}

