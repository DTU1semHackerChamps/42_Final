package Model.Tiles;

import Model.Player;
import Model.TileOwners;

public class FerryTile extends OwnableTile {

    private int faceValue;

    public FerryTile(Player currentPlayer, Player[] players, TileOwners owners, int faceValue) {
        super(currentPlayer, players, owners);
        this.faceValue = faceValue;
    }

    @Override
    public void executeTile() {


    }
}
