package Model;


import Model.BuildableTilePrices;
import Model.Player;
import Model.TileOwners;

public class BuyHouse {

    public static boolean buildHouse(BuildableTilePrices[] data, Player currentPlayer, int position, TileOwners tileOwners) {
        boolean builtHouse = false;
        int priceOfHouse;

        if(position != -1){
            priceOfHouse = data[position].getPriceOfHouse();

            if ((currentPlayer.getBalance() >= priceOfHouse) && (tileOwners.getTileHouses(position) <= 4) && (tileOwners.getTileHotel(position) < 1)) {

                tileOwners.addTileHouses(position);
                currentPlayer.addBalance(-priceOfHouse);
                builtHouse = true;
            }

            if(position == 0){
                builtHouse = false;
            }
        }

        return builtHouse;
    }
}