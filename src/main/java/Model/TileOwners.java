package Model;

public class TileOwners {

    private int[][] tileOwners;

    /**
     * The constructor, sets all the row in first column equal to -1.
     * First column holds the owner, second the amount of houses, third 1 if there is a hotel.
     *
     */
    public TileOwners () {
        tileOwners = new int[40][3];
        for (int i = 0; i < tileOwners.length; i++) {
            tileOwners[i][0] = -1;
        }
    }

    private int[][] getTileOwners() {
        return tileOwners;
    }

    /**
     * This method returns the number of the owner at a specific tile position.
     * @param position
     * @return owner of a tile at a the position.
     */
    public int getTileOwner(int position) {
        int tileOwner;
        tileOwner = tileOwners[position][0];
        return tileOwner;
    }

    /**
     * This method returns the number of houses at a specific tile position.
     * @param position
     * @return number of houses at a tile position.
     */
    public int getTileHouses(int position) {
        int houses;
        houses = tileOwners[position][1];
        return houses;
    }

    /**
     * Returns if there is a hotel at a tile position.
     * @param position
     * @return returns a 1 if there is a hotel at the tile position.
     */
    public int getTileHotel(int position) {
        int hotel;
        hotel = tileOwners[position][2];
        return hotel;
    }

    public void setTileOwners(int[][] tileOwners) {
        this.tileOwners = tileOwners;
    }

    public void setTileOwner(int position, int owner) {
        tileOwners[position][0] = owner;
    }

    public void setTileHouses(int position, int houses){
        tileOwners[position][1] = houses;
    }

    public void setTileHotel(int position, int hotel){
        tileOwners[position][2] = hotel;
    }

    /**
     * This method is in charge of adding house to the owners object whenever it is called.
     * If there is already is 4 houses it adds a hotel and if there already is a hotel it does nothing.
     * @param position landing position of the player
     */
    public void addTileHouses(int position){
        if (tileOwners[position][2] == 0) {
            if (tileOwners[position][1] < 4) {
                tileOwners[position][1] += 1;
            } else {
                tileOwners[position][2] += 1;
            }
        }

    }

}
