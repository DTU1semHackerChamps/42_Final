package Model;

import Model.Player.Player;

public class PropertyGroup {

    private int [] tileGroup;

    /**
     * This constructor chooses between if it makes a 2 or 3 length array buy. And is used to save which tiles are grouped together.
     * @param one
     * @param two
     * @param three If this variable is 0 the array only be the first two variables.
     */
    public PropertyGroup(int one, int two, int three){
        if(three != 0) {
            this.tileGroup = new int[]{one, two, three};
        } else {
            this.tileGroup = new int[]{one,two};
        }
    }


    public static PropertyGroup[] tileGroups(){

        PropertyGroup [] tileGroups = new PropertyGroup[8];


        tileGroups[0] = new PropertyGroup(1,3,0);
        tileGroups[1] = new PropertyGroup(6,8,9);
        tileGroups[2] = new PropertyGroup(11,13,14);
        tileGroups[3] = new PropertyGroup(16,18,19);
        tileGroups[4] = new PropertyGroup(21,23,24);
        tileGroups[5] = new PropertyGroup(26,27,29);
        tileGroups[6] = new PropertyGroup(31,32,34);
        tileGroups[7] = new PropertyGroup(37,39,0);

        return tileGroups;
    }

    /**
     * Checks at what array index a specific tile position is. This is used to determine what number group the tile is in.
     * @param tileGroups
     * @param tilePosition
     * @return returns the group number the tile position is in.
     */

    public static int groupNumber(PropertyGroup[] tileGroups, int tilePosition){
        int groupNumber = 0;

        //uses nested forloops to check through every array in the PropertyGroup[].
        for (int i = 0; i < tileGroups.length; i++) {
            for (int j = 0; j < tileGroups[i].getPropertyGroup().length; j++) {
                if(tilePosition == tileGroups[i].getPropertyGroup()[j]){
                    groupNumber = i;
                }
            }
        }

        return groupNumber;
    }

//    public static void main(String[] args) {
//        PropertyGroup[] tester = PropertyGroup.tileGroups();
//
//
//
//        System.out.println(PropertyGroup.groupNumber(tester, 2));
//
//    }

    public int[] getPropertyGroup(){
        return tileGroup;
    }

    /**
     * Checks if the currentPlayer on a specific position has all buildable tiles of the same catagory.
     * @param owner array that also holds the owners of the specific tiles on the board.
     * @param currentPlayer
     * @param tilePosition the position that is checked.
     * @param tileGroups holds the data about which tiles are grouped together.
     * @return returns true if the owner of the tile owns all tiles in the category.
     */
    public static boolean hasGroup(TileOwners owner, Player currentPlayer, int tilePosition, PropertyGroup[] tileGroups){

        boolean hasGroup = true;
        int numOfPlayer = currentPlayer.getPlayerNum();
        //each group of buildable tiles has a designated array index. This line of code saves what it is.
        int tileGroupNumber = PropertyGroup.groupNumber(tileGroups,tilePosition);
        //each array in the tileGroups array holds the positions of the tiles in that group. This for loop checks those positions and who their owner is.
        for (int i = 0; i < tileGroups[tileGroupNumber].getPropertyGroup().length; i++) {
            //if any of the positions has another owner than the currentPlayer this statement returns false.
            if(owner.getTileOwner(tileGroups[tileGroupNumber].getPropertyGroup()[i]) != numOfPlayer){
                hasGroup = false;
            }
        }
        return hasGroup;
    }


}
