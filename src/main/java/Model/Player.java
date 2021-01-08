package Model;

import ChanceCard.JailCard;

public class Player {
    private int balance;
    private int position;
    private String playerName;
    private boolean jailCard;
    private int playerNum;



    public Player(int balance, int position, String playerName, boolean jailCard,int playerNum){

        this.balance = balance;
        this.position = position;
        this.jailCard = jailCard;
        this.playerName = playerName;
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

    public void setPosition(int position) {
        this.position = position;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
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

