package Model;


import Model.Player.Player;

public class BuyHouse {

    /**
     * allows the current player to build a house or hotel on the players owned property's
     * @param data gets the prices for building a house/hotel on the specific street the player chose
     * @param currentPlayer
     * @param position position on the board
     * @param tileOwners
     * @return buildHouse as true
     */
    public static boolean buildHouse(BuildableTilePrices[] data, Player currentPlayer, int position, TileOwners tileOwners) {
        boolean builtHouse = false;
        int priceOfHouse;

        //exception to avoid array out of bounds failure from buildingAvailability().
        if(position != -1){
            priceOfHouse = data[position].getPriceOfHouse();

            //This if statement checks if there is a hotel or less
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