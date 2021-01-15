package Model;

public class SellProperty {


    /**
     * methode for removing a house or hotel from a owned property and gives the player half of the original buying price back
     * @param price
     * @param currentPlayer
     * @param position
     * @param tileOwners
     */
    public static void sellHouse(BuildableTilePrices[] price, Player currentPlayer, int position, TileOwners tileOwners) {
        int priceOfHouse;

        if(position != -1) {
            priceOfHouse = price[position].getPriceOfHouse();


            if (tileOwners.getTileHotel(position) == 1) {
                tileOwners.setTileHotel(position, 0);
                tileOwners.setTileHouses(position, 0);
                currentPlayer.addBalance((priceOfHouse * 5) / 2);
            } else {
                int houseAmount = tileOwners.getTileHouses(position) - 1;
                tileOwners.setTileHouses(position, houseAmount);
                currentPlayer.addBalance(priceOfHouse / 2);
            }
        }
    }


    /**
     * Methode for selling a property to another player for an agreed price.
     * @param currentPlayer
     * @param position
     * @param bid
     * @param tileOwners
     * @param players
     * @param playerNum
     * @return soldProperty
     */
    public static boolean sellProperty(Player currentPlayer, int position, int bid, TileOwners tileOwners, Player[] players, int playerNum) {
        boolean soldProperty = false;

        if (players[playerNum].getBalance() > bid) {
            players[playerNum].addBalance(-bid);
            currentPlayer.addBalance(bid);
            tileOwners.setTileOwner(position, playerNum);
            soldProperty = true;
        }
        return soldProperty;
    }
}