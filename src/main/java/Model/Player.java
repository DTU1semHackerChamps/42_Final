package Model;


public class Player {
    private int balance;
    private int position;
    private boolean isInJail;
    private int playerNum;



    public Player(int balance, int position, boolean isInJail,int playerNum){

        this.balance = balance;
        this.position = position;
        this.isInJail = isInJail;
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

    /**
     * Gives the player 4000kr of passing start.
     * @param newPosition
     */
    public void setPosition(int newPosition) {

        if (position > newPosition) {
            balance += 4000;
        }
        position = newPosition;
    }


    public boolean isJailCard() {
        return isInJail;
    }

    public void setIsInJail(boolean isInJail) {
        this.isInJail = isInJail;
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

    /**
     * Ensures that the position does not exceed the tile array that is playable,
     * and gives the player 4000 kr for passing start.
     * @param faceValue Sum of the dice
     */
    public void addPosition(int faceValue){
        position += faceValue;

        if(position > 39){
            position -= 40;
            balance += 4000;
        }

    }

    /**
     * Creates an array of players with balance pf 30000 kr.
     * @param numOfPlayers An integer value corresponding with the number of players in the game
     * @return Player array
     */
    public static Player[] playerList(int numOfPlayers){

        Player[] players = new Player[numOfPlayers];

        for(int i = 0; i < numOfPlayers; i++){
            players[i] = new Player(30000, 0,false, i+1 );
        }

        return players;
    }

    /**
     * increment the current player number
     * @param index
     * @param players
     * @return the number of the player
     */
    public static int nextPlayer(int index, Player[] players){
        index = ++index % players.length;
        return index;
    }

    /**
     * increment to the next player if current player is bankrupt
     * @param index
     * @param players
     * @param bankruptPlayer
     * @return the new number of the player
     */
    public static int switchPlayer(int index, Player[] players, BankruptPlayers bankruptPlayer){
        int playerNum = 0;
        while(true) {
            playerNum = Player.nextPlayer(index, players);
            if(!bankruptPlayer.getBankruptPlayers()[playerNum]){
                break;
            }
        }
        return playerNum;
    }



}

