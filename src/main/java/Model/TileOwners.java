package Model;

public class TileOwners {

    private int[][] tileOwners;

    public TileOwners () {
        tileOwners = new int[40][3];
    }

    public int[][] getTileOwners() {
        return tileOwners;
    }

    public int getTileOwner(int position) {
        int tileOwner;
        tileOwner = tileOwners[position][1];
        return tileOwner;
    }

    public int getTileHouses(int position) {
        int houses;
        houses = tileOwners[position][2];
        return houses;
    }

    public int getTileHotel(int position) {
        int hotel;
        hotel = tileOwners[position][3];
        return hotel;
    }

    public void setTileOwners(int[][] tileOwners) {
        this.tileOwners = tileOwners;
    }

    public void setTileOwner(int position, int owner) {
        tileOwners[position][1] = owner;
    }

    public void setTileHouses(int position, int houses){
        tileOwners[position][2] = houses;
    }

    public void setTileHotel(int position, int hotel){
        tileOwners[position][3] = hotel;
    }

}
