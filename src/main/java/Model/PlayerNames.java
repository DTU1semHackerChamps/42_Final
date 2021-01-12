package Model;

public class PlayerNames {

    private String[] names;
    public PlayerNames(Player [] players) {
        this.names = new String[players.length];
    }

    public void setPlayerName(int numOfPlayer, String name){
        names[numOfPlayer] = name;
    }

    public String getPlayerName(int numOfPlayer){
        String name = names[numOfPlayer];
        return name;
    }



}
