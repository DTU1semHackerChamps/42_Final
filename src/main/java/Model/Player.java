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


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int newPosition) {

        if (position > newPosition) {
            balance += 4000;
        }
        position = newPosition;
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

    public void addBalance(int balanceChance){
        balance += balanceChance;

    }

    public void addPosition(int faceValue){
        position = faceValue;

        if(position > 39){
            position -= 40;
            balance += 4000;
        }

    }

    public static Player[] playerList(int numOfPlayers){

        Player[] players = new Player[numOfPlayers];

        for(int i = 0; i < numOfPlayers; i++){
            players[i] = new Player(30000, 0,false, i );
        }

        return players;
    }
}

