package Model.Tiles;

import Model.Player;
import Model.TileOwners;

public class FerryTile extends OwnableTile {

    private int faceValue;

    public FerryTile(Player[] players, TileOwners owners) {
        super(players, owners);

    }

    /**
     * This method take away 4000 from the player balance..
     */
    @Override
    public void executeTile(Player currentPlayer) {
        currentPlayer.addBalance(-4000);
    }
}
