package Model.Tiles;

import Model.Player;

public class FerryTile extends OwnableTile {

    private  int faceValue;

    public FerryTile(Player currentPlayer, Player[] players, int faceValue) {
        super(currentPlayer, players);
        this.faceValue = faceValue;
    }

    @Override
    public void executeTile() {


    }
}
