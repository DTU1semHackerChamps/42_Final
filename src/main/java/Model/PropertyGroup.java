package Model;

public class PropertyGroup {

    private int [] tileGroup;

    public PropertyGroup(int one, int two, int three){
        if(three != 0) {
            this.tileGroup = new int[]{one, two, three};
        } else {
            this.tileGroup = new int[]{one,two};
        }
    }


    public static PropertyGroup[] tileGroups(){

        PropertyGroup [] tileGroups = new PropertyGroup[8];


        tileGroups[0]=new PropertyGroup(1,3,0);
        tileGroups[1]=new PropertyGroup(6,8,9);
        tileGroups[2]=new PropertyGroup(11,13,14);
        tileGroups[3]=new PropertyGroup(16,18,19);
        tileGroups[4]=new PropertyGroup(21,23,24);
        tileGroups[5]=new PropertyGroup(26,27,29);
        tileGroups[6]=new PropertyGroup(31,32,34);
        tileGroups[7]=new PropertyGroup(37,39,0);

        return tileGroups;
    }

    public static int groupNumber(PropertyGroup[] tileGroups, int tilePosition){
        int groupNumber = 0;
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

    public boolean hasGroup(TileOwners owner, Player currentPlayer, int tilePosition){
        boolean hasGroup = false;
        int numOfPlayer = currentPlayer.getPlayerNum();
        for (int i = 0; i < owner.getTileOwners().length; i++) {

        }

        return hasGroup;
    }


}
