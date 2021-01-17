package Model.Tiles;

import Model.Player.Player;
import Model.PropertyGroup;
import Model.TileOwners;
import Model.BuildableTilePrices;

public class BuildableTile extends OwnableTile {

    private BuildableTilePrices[]  tilesData;
    private TileOwners[] owner;
    private PropertyGroup[] propertyGroups;

    /**
     * This constructor is used to describe the tile effect of the tiles you can build on.
     * @param players array of the players in the game.
     * @param owners holds data about who owns each tile, the amount of houses or if there is a hotel or not.
     * @param tilesData holds data about rent prices of each amount of houses, hotel, and without any buildings.
     * @param propertyGroups used to check if a player has all the properties in a color group.
     */

    public BuildableTile(Player[] players, TileOwners owners, BuildableTilePrices[] tilesData, PropertyGroup[]  propertyGroups) {
        super(players, owners);
        this.tilesData = tilesData;
        this.owners = owners;
        this.propertyGroups = propertyGroups;
    }

    /**
     * This method calculates the amount of rent a player should pay when landing on a buildable tile.
     * @param currentPlayer the plyer whose turn it is.
     * @param sumOfDice not used for anything in this method.
     */

    @Override
    public void executeTile(Player currentPlayer, int sumOfDice) {
        int playerPosition = currentPlayer.getPosition();
        int rent = 0;
        //if the tileowner is -1 (means that no one owns it) this method does nothing
        if (owners.getTileOwner(playerPosition) != -1) {

            //takes the amount of houses on the tile to calculate the rent
            switch (owners.getTileHouses(playerPosition)) {
                case 0:
                    //in the case that the amount of houses is 0 the method first checks if there is a hotel.
                    if (owners.getTileHotel(playerPosition) == 1) {
                        rent = tilesData[playerPosition].getHotel();
                        // if not the hasGroup() method is used to check if the rent should be double the base rent or not.
                    } else if (PropertyGroup.hasGroup(owners, players[owners.getTileOwner(playerPosition)], playerPosition, propertyGroups)) {
                        rent = tilesData[playerPosition].getRentOfGround() * 2;
                    } else {
                        rent = tilesData[playerPosition].getRentOfGround();
                    }
                    currentPlayer.addBalance(-rent);
                    players[owners.getTileOwner(playerPosition)].addBalance(rent);

                    break;

                    //in case if the amount of houses are 1-4
                case 1:
                    rent = tilesData[playerPosition].getOneHouse();
                    currentPlayer.addBalance(-rent);
                    players[owners.getTileOwner(playerPosition)].addBalance(rent);
                    break;
                case 2:
                    rent = tilesData[playerPosition].getTwoHouse();
                    currentPlayer.addBalance(-rent);
                    players[owners.getTileOwner(playerPosition)].addBalance(rent);
                    break;
                case 3:
                    rent = tilesData[playerPosition].getThreeHouse();
                    currentPlayer.addBalance(-rent);
                    players[owners.getTileOwner(playerPosition)].addBalance(rent);
                    break;
                case 4:
                    rent = tilesData[playerPosition].getFourHouse();
                    currentPlayer.addBalance(-rent);
                    players[owners.getTileOwner(playerPosition)].addBalance(rent);
                    break;
            }
        }
    }
}
