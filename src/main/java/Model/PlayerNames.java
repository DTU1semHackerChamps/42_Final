package Model;

public class PlayerNames {

    // String array containing all names
    private String[] names;

    // Constructor for our PlayerNames class
    public PlayerNames(Player[] players) {
        this.names = new String[players.length]; }

    // Setter method for setting the player name
    public void setPlayerName(int numOfPlayer, String name){
        names[numOfPlayer] = name;
    }

    // Getter method for getting the player name
    public String getPlayerName(int numOfPlayer){
        String name = names[numOfPlayer];
        return name;
    }
}
