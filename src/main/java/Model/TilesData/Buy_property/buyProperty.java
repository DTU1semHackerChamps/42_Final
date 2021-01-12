package Model.TilesData.Buy_property;


import Model.BuildableTilePrices;
import Model.Player;
import Model.TileOwners;

public class buyProperty {

    public boolean buildHouse(BuildableTilePrices[] data, Player currentPlayer, int position, TileOwners tileOwners) {
        boolean builtHouse = false;
        int priceOfHouse = data[position].getPriceOfHouse();

        if (currentPlayer.getBalance() >= priceOfHouse) {
            tileOwners.addTileHouses(position);
            currentPlayer.addBalance(-priceOfHouse);
            builtHouse = true;
        }

        return builtHouse;
    }





}