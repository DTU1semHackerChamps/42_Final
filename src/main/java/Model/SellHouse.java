package Model;

import Model.Player.Player;

public class SellHouse {


    /**
     * methode for removing a house or hotel from a owned property and gives the player half of the original buying price back
     * @param price
     * @param currentPlayer
     * @param position
     * @param tileOwners
     */
    public static void sellHouse(BuildableTilePrices[] price, Player currentPlayer, int position, TileOwners tileOwners) {
        int priceOfHouse;
        //Exception for if the tile isnt a buildable tile.
        if(position != -1) {
            priceOfHouse = price[position].getPriceOfHouse();

            //Money back from hotel
            if (tileOwners.getTileHotel(position) == 1) {
                tileOwners.setTileHotel(position, 0);
                tileOwners.setTileHouses(position, 0);
                currentPlayer.addBalance((priceOfHouse * 5) / 2);
            } else {
                // money back from house
                int houseAmount = tileOwners.getTileHouses(position) - 1;
                tileOwners.setTileHouses(position, houseAmount);
                currentPlayer.addBalance(priceOfHouse / 2);
            }
        }
    }
}