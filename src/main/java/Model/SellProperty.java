package Model;

public class SellProperty {

    public static void sellHouse(BuildableTilePrices[] price, Player currentPlayer, int position, TileOwners tileOwners) {
        int priceOfHouse;
        priceOfHouse = price[position].getPriceOfHouse();


        if (tileOwners.getTileHotel(position) == 1) {
            tileOwners.setTileHotel(position, -1);
            currentPlayer.addBalance((priceOfHouse * 5) / 2);
        } else {
            tileOwners.setTileHouses(position, -1);
            currentPlayer.addBalance(priceOfHouse / 2);
        }
    }



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