package Model.Tiles;

import Model.Player;
import Model.TileOwners;

public class FerryTile extends OwnableTile {

    private int faceValue;

    public FerryTile(Player currentPlayer, Player[] players, TileOwners owners) {
        super(currentPlayer, players, owners);

    }

    @Override
    public void executeTile() {
        currentPlayer.addBalance(-4000);
    }
}
