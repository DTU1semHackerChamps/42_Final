package Model;

import gui_fields.GUI_Player;

public class PlayerNames {

    private String[] names;

    public PlayerNames(Player[] players) {
        this.names = new String[players.length];
    }

    public void setPlayerName(int numOfPlayer, String name) {
        names[numOfPlayer] = name;
    }

    public String getPlayerName(int numOfPlayer) {
        String name = names[numOfPlayer];
        return name;
    }

    public static String[] playerNameList(GUI_Player[] guiPlayer) {

        String[] playerNames = new String[guiPlayer.length];

        for (int i = 0; i < guiPlayer.length; i++) {
            playerNames[i] = guiPlayer[i].getName();

        }
        return playerNames;
    }
}
