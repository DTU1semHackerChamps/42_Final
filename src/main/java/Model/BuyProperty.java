package Model;

import Model.Player.Player;

public class BuyProperty {


    /**
     * Method for buying the property they are currently standing on if available.
     * @param currentPlayer
     * @param owners
     * @param buildTileData
     * @param companyTilePrices
     * @return propertyBought as true
     */
    public static boolean buyProperty(Player currentPlayer, TileOwners owners, BuildableTilePrices[] buildTileData, CompanyTilePrices[] companyTilePrices){
        boolean propertyBought= false;
        int position = currentPlayer.getPosition();
        int tilePrice = buildTileData[position].getPropertyPrice() + companyTilePrices[position].getPriceOfCompany();
        //Exception for if the property doesnt have a price.
        if((buildTileData[position].getPropertyPrice() != 0) || (companyTilePrices[position].getPriceOfCompany() != 0)) {
            //If the player has enough balance the property is bought.
            if (currentPlayer.getBalance() > tilePrice) {
                if (owners.getTileOwner(position) == -1) {
                    currentPlayer.addBalance(-tilePrice);
                    owners.setTileOwner(position, currentPlayer.getPlayerNum());
                    propertyBought = true;
                }
            }
        }

        return propertyBought;
    }
}
