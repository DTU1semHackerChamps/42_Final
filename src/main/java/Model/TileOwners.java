package Model;

public class TileOwners {

    private int[] tileOwners;

    public TileOwners (int length) {
        tileOwners = new int[length];
    }

    public int[] getTileOwners() {
        return tileOwners;
    }

    public int getTileOwner(int position) {
        int tileOwner;
        tileOwner = tileOwners[position];
        return tileOwner;
    }

    public void setTileOwners(int[] tileOwners) {
        this.tileOwners = tileOwners;
    }

    public void setTileOwner(int position, int owner) {
        tileOwners[position] = owner;
    }


}
