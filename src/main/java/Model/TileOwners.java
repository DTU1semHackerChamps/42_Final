package Model;

public class TileOwners {

    private int arrayLength;
    private int[] tileOwners;

    public TileOwners (int length) {

        arrayLength = length;
        tileOwners = new int[arrayLength];
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
