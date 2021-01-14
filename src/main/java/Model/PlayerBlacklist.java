package Model;

public class PlayerBlacklist {

    private boolean[] blacklist;

    public PlayerBlacklist(Player[] players){
        blacklist = new boolean[players.length];
    }

    public void blacklistPlayer(int playerNum) {
        blacklist[playerNum] = true;
    }

    public boolean[] getBlacklist() {
        return blacklist;
    }
}
