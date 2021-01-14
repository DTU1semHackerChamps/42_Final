package Model;

public class BuyProperty {
    public static boolean buyProperty(Player currentPlayer, TileOwners owners, BuildableTilePrices[] buildTileData, CompanyTilePrices[] companyTilePrices){
        boolean propertyBought= false;
        int position = currentPlayer.getPosition();
        int tilePrice = buildTileData[position].getPropertyPrice() + companyTilePrices[position].getPriceOfCompany();
            if(currentPlayer.getBalance() > tilePrice) {
                if (owners.getTileOwner(position) == -1) {
                    currentPlayer.addBalance(-tilePrice);
                    owners.setTileOwner(position, currentPlayer.getPlayerNum());
                    propertyBought = true;
                }
            }
        return propertyBought;
    }
}
