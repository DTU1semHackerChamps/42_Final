package Model.Tiles;

import Model.Player;
import Model.TileOwners;

public abstract class OwnableTile extends Tile {

    protected TileOwners owners;

    public OwnableTile(Player currentPlayer, Player[] players, TileOwners owners) {
        super(currentPlayer, players);
        this.owners = owners;
    }

    @Override
    public void executeTile() {

    }
}
