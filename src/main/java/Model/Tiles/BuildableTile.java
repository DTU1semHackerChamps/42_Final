package Model.Tiles;

import Model.Player;
import Model.PropertyGroup;
import Model.TileOwners;
import Model.BuildableTilePrices;

public class BuildableTile extends OwnableTile {

    private BuildableTilePrices[]  tilesData;
    private TileOwners[] owner;
    private PropertyGroup[] propertyGroups;

    public BuildableTile(Player[] players, TileOwners owners, BuildableTilePrices[] tilesData, PropertyGroup[]  propertyGroups) {
        super(players, owners);
        this.tilesData = tilesData;
        this.owners = owners;
        this.propertyGroups = propertyGroups;
    }

    @Override
    public void executeTile(Player currentPlayer, int sumOfDice) {
        int playerPosition = currentPlayer.getPosition();
        int rent = 0;

        if (owners.getTileOwner(playerPosition) != -1) {
            switch (owners.getTileHouses(playerPosition)) {
                case 0:
                    if (owners.getTileHotel(playerPosition) == 1) {
                        rent = tilesData[playerPosition].getHotel();
                    } else if (PropertyGroup.hasGroup(owners, players[owners.getTileOwner(playerPosition)], playerPosition, propertyGroups)) {
                        rent = tilesData[playerPosition].getRentOfGround() * 2;
                    } else {
                        rent = tilesData[playerPosition].getRentOfGround();
                    }
                    currentPlayer.addBalance(-rent);
                    players[owners.getTileOwner(playerPosition)].addBalance(rent);

                    break;
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
