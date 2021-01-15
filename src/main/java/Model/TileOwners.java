package Model;

public class TileOwners {

    private int[][] tileOwners;

    /**
     * The constructor, sets all the row in first column equal to -1.
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

    public int getTileOwner(int position) {
        int tileOwner;
        tileOwner = tileOwners[position][0];
        return tileOwner;
    }

    public int getTileHouses(int position) {
        int houses;
        houses = tileOwners[position][1];
        return houses;
    }

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
     * This method is in charge of adding house to the players whenever it is called.
     * As one can see it is void method,so it's not committed to return.
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
