package View;

import Model.PlayerColor;
import Model.TileOwners;
import gui_fields.GUI_Street;


public class PropertyOwnerView {

public static void updateBorderColor (GUI_Street[] street, TileOwners owners, PlayerColor[] color){

    for (int i = 0; i < street.length; i++) {
        if (owners.getTileOwner(i) != -1) {
            street[i].setBorder(color[owners.getTileOwner(i)].getColor());
            }
        }
    }


    public static void tilDescriptions(GUI_Street[] fields) {
        String rent = "    Leje af ejendommen ";
        String hHOne = "\\n Hvert hus => 1000 kr. \\nEt hotel => 1000 + 4 huse";
        String hHTwo = "\\n Hvert hus => 2.000 kr. \\nEt hotel => 2.000 + 4 huse";


        fields[0].setDescription("Modtag 4000 kr");
        fields[1].setDescription(rent +   "\\n grund => 50 kr. \\n  1 hus => 250 kr. \\n  2 hus => 750 kr. \\n  3 hus => 2.250 kr. \\n  4 hus => 4.000 kr." +
                " \\n  Hotel => 6.000 kr. \\n" + hHOne );

        fields[3].setDescription(rent +   "\\n grund => 50 kr. \\n  1 hus => 250 kr. \\n  2 hus => 750 kr. \\n  3 hus => 2.250 kr. \\n  4 hus => 4.000 kr." +
                " \\n  Hotel => 6.000 kr. \\n" + hHOne );

        fields[4].setDescription("Betal indkomstskat: 10%, hvis pengebeholdningen er mindre end 40000 kr. Ellers 4.000 kr.");

        fields[6].setDescription(rent +   "\\n grund => 100 kr. \\n  1 hus => 600 kr. \\n  2 hus => 1.800 kr. \\n  3 hus => 5.400 kr. \\n  4 hus => 8.000 kr." +
                " \\n  Hotel => 11.000 kr. \\n" + hHOne );

        fields[8].setDescription(rent +   "\\n grund => 100 kr. \\n  1 hus => 600 kr. \\n  2 hus => 1.800 kr. \\n  3 hus => 5.400 kr. \\n  4 hus => 8.000 kr." +
                " \\n  Hotel => 11.000 kr. \\n" + hHOne );

        fields[9].setDescription(rent +   "\\n grund => 150 kr. \\n  1 hus => 800 kr. \\n  2 hus => 2.000 kr. \\n  3 hus => 6.000 kr. \\n  4 hus => 9.000 kr." +
                " \\n  Hotel => 12.000 kr. \\n" + hHOne );



        //Frederiksberg alle
        String a = rent +   "\\n grund => 200 kr. \\n  1 hus => 1.000 kr. \\n  2 hus => 3.000 kr. \\n  3 hus => 9.000 kr. \\n  4 hus => 12.500 kr." +
                " \\n  Hotel => 15.000 kr. \\n" + hHTwo;

        fields[11].setDescription(a);

        // Bulowsvej
        fields[13].setDescription(a);

        // Gl. Kongevej
        fields[14].setDescription(rent +   "\\n grund => 250 kr. \\n  1 hus => 1.200 kr. \\n  2 hus => 3.750 kr. \\n  3 hus => 10.000 kr. \\n  4 hus => 14.000 kr." +
                " \\n  Hotel => 18.000 kr. \\n" + hHTwo);

        // Bernstorffsvej
        String b = rent +   "\\n grund => 300 kr. \\n  1 hus => 1.400 kr. \\n  2 hus => 4.000 kr. \\n  3 hus => 11.000 kr. \\n  4 hus => 15.000 kr." +
                " \\n  Hotel => 19.000 kr. \\n" + hHTwo;

        fields[16].setDescription(b);
        // Hellerupvej
        fields[18].setDescription(b);





//        fields[1].setDescription(rent +   "\\n  1 hus => 250 kr");
//        fields[1].setDescription(rent +   "\\n  2 hus => 750 kr");
//        fields[1].setDescription(rent +   "\\n  3 hus => 2250 kr");
//        fields[1].setDescription(rent +   "\\n  4 hus => 4000 kr");
//        fields[1].setDescription(rent +   "\\n  Hotel => 6000 kr");

    }
}


