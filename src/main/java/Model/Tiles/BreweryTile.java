package Model.Tiles;

import Model.Player;
import Model.TileOwners;

public class BreweryTile extends OwnableTile {
    public BreweryTile(Player currentPlayer, Player[] players, TileOwners owners) {
        super(currentPlayer, players, owners);
    }

    @Override
    public void executeTile() {
        currentPlayer.addBalance(-3000);

    }
}
