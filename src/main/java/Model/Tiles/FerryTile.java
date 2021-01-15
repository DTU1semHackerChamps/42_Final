package Model.Tiles;

import Model.Player;
import Model.TileOwners;

public class FerryTile extends OwnableTile {

    private int faceValue;

    public FerryTile(Player[] players, TileOwners owners) {
        super(players, owners);

    }


    @Override
    public void executeTile(Player currentPlayer) {

    }
}
