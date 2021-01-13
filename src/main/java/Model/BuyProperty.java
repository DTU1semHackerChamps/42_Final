package Model;

public class BuyProperty {
    public boolean buyProperty(Player currentPlayer, TileOwners owners, BuildableTilePrices[] tileData){
        boolean propertyBought= false;
        int position = currentPlayer.getPosition();
        int tilePrice = tileData[position].getPropertyPrice();
            if(currentPlayer.getBalance() < tilePrice) {
                if (owners.getTileOwner(position) == 0) {
                    currentPlayer.addBalance(-tilePrice);
                    owners.setTileOwner(position, currentPlayer.getPlayerNum());
                    propertyBought = true;
                }
            }
        return propertyBought;
    }


}
