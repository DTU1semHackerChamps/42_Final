package Model;

public class PropertyGroups {

    public static int [] Groups(TileOwners[] tileOwners, int position) {

        int color = 0;
        boolean allOwned;

        int [] propertyGroups = new int[40];

        /*
        1 blue
        2 orange
        3 green
        4 grey
        5 red
        6 white
        7 yellow
        8 purple
        */

        // Properties are grouped into numbers representing a color see above.
        propertyGroups[1] = 1;
        propertyGroups[3] = 1;
        propertyGroups[6] = 2;
        propertyGroups[8] = 2;
        propertyGroups[9] = 2;
        propertyGroups[11] = 3;
        propertyGroups[13] = 3;
        propertyGroups[14] = 3;
        propertyGroups[16] = 4;
        propertyGroups[18] = 4;
        propertyGroups[19] = 4;
        propertyGroups[21] = 5;
        propertyGroups[23] = 5;
        propertyGroups[24] = 5;
        propertyGroups[26] = 6;
        propertyGroups[27] = 6;
        propertyGroups[29] = 6;
        propertyGroups[31] = 7;
        propertyGroups[32] = 7;
        propertyGroups[34] = 7;
        propertyGroups[37] = 8;
        propertyGroups[39] = 8;

        color = propertyGroups[position];
        int j = 0;
        int[] colorArr= new int[3];

        for (int i = 0; i < propertyGroups.length; i++) {
            color = propertyGroups[i];

            if(propertyGroups[i] == color){
                colorArr[j] = i;
                j++;
            }

        }


        for (int i = 0; i == j; i++) {


        }

        return allOwned;
    }

}
