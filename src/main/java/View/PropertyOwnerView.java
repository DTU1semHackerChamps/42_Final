package View;

import Model.*;
import Model.Player.Player;
import Model.Player.PlayerColor;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.util.HashMap;


public class PropertyOwnerView {

    public static void updateBorderColor(GUI_Street[] street, TileOwners owners, PlayerColor[] color) {

        for (int i = 0; i < street.length; i++) {
            if (owners.getTileOwner(i) != -1) {
                street[i].setBorder(color[owners.getTileOwner(i)].getColor());
            }
        }
    }

    /**
     * Menu which shows the available properties that contains buildings, and returns an integer value for the desired
     * location the player wants to sell a building on.
     *
     * @param stringList
     * @param boardData
     * @param gui
     * @param currentPlayer
     * @param owners
     * @param propertyGroups
     * @return housePosition
     */
    public static int sellHouseView(HashMap<String, String> stringList, GUIBoardData[] boardData, GUI gui, Player currentPlayer, TileOwners owners, PropertyGroup[] propertyGroups) {

        int housePosition = -1;
        int availableTiles = 0;
        String[] tempStreetNames = new String[boardData.length];
        for (int i = 0; i < boardData.length; i++) {
            tempStreetNames[i] = " ";
            if (currentPlayer.getPlayerNum() == owners.getTileOwner(i) && PropertyGroup.hasGroup(owners, currentPlayer, i, propertyGroups)) {
                if (owners.getTileHouses(i) >= 1) {
                    tempStreetNames[i] = boardData[i].getStreetName();
                    availableTiles++;
                } else if (owners.getTileHotel(i) == 1) {
                    tempStreetNames[i] = boardData[i].getStreetName();
                    availableTiles++;
                }

            }
        }
        // Filters out the empty strings
        int k = 0;
        String[] streetNames = new String[availableTiles];

        for (int i = 0; i < boardData.length; i++) {
            if (!tempStreetNames[i].equals(" ")) {
                streetNames[k] = tempStreetNames[i];
                k++;
            }
        }

        if (availableTiles == 0) {
            gui.showMessage(stringList.get("noSellableBuildings"));
        } else {

            String propertyName = gui.getUserSelection(stringList.get("chooseSellableBuildings"), streetNames);

            for (int i = 0; i < boardData.length; i++) {
                if (propertyName == boardData[i].getStreetName()) {
                    housePosition = i;
                    break;
                }
            }
        }
        return housePosition;
    }

    public static void tileDescriptions(GUI_Street[] fields) {
        String rent = "    Leje af ejendommen ";
        String hHOne = "\\n Hvert hus => 1000 kr. \\nEt hotel => 1000 + 4 huse";
        String hHTwo = "\\n Hvert hus => 2.000 kr. \\nEt hotel => 2.000 + 4 huse";
        String hHThree = "\\n Hvert hus => 3.000 kr. \\nEt hotel => 3.000 + 4 huse";
        String hHFour = "\\n Hvert hus => 4.000 kr. \\nEt hotel => 4.000 + 4 huse";

        fields[0].setDescription("Modtag 4000 kr");
        // Rødevrevej
        String roedevrevej = rent +   "\\n grund => 50 kr. \\n  1 hus => 250 kr. \\n  2 hus => 750 kr. \\n  3 hus => 2.250 kr. \\n  4 hus => 4.000 kr." +
                " \\n  Hotel => 6.000 kr. \\n" + hHOne;
        fields[1].setDescription(roedevrevej);
        // Hvidovrevej
        fields[3].setDescription(roedevrevej);
        // betal skat
        fields[4].setDescription("Betal indkomstskat: 10%, hvis pengebeholdningen er mindre end 40000 kr. Ellers 4.000 kr.");
        // Roskildevej
        String Roskildevej = rent +   "\\n grund => 100 kr. \\n  1 hus => 600 kr. \\n  2 hus => 1.800 kr. \\n  3 hus => 5.400 kr. \\n  4 hus => 8.000 kr." +
                " \\n  Hotel => 11.000 kr. \\n" + hHOne;
        fields[6].setDescription(Roskildevej );
        // Valvy Langgade
        fields[8].setDescription(Roskildevej);
        // Allegade
        fields[9].setDescription(rent +   "\\n grund => 150 kr. \\n  1 hus => 800 kr. \\n  2 hus => 2.000 kr. \\n  3 hus => 6.000 kr. \\n  4 hus => 9.000 kr." +
                " \\n  Hotel => 12.000 kr. \\n" + hHOne );
        //Frederiksberg alle
        String frederiksberg = rent +   "\\n grund => 200 kr. \\n  1 hus => 1.000 kr. \\n  2 hus => 3.000 kr. \\n  3 hus => 9.000 kr. \\n  4 hus => 12.500 kr." +
                " \\n  Hotel => 15.000 kr. \\n" + hHTwo;
        fields[11].setDescription(frederiksberg);
        // Bulowsvej
        fields[13].setDescription(frederiksberg);
        fields[12].setDescription("Hvis du ejer grunden, så skal du betale 100 gange så meget, som øjnene viser. \\n Hvis du både TURGORG SQUASH og Coca-Cola ejer, så er det 200 gange.");
        // Gl. Kongevej
        fields[14].setDescription(rent +   "\\n grund => 250 kr. \\n  1 hus => 1.200 kr. \\n  2 hus => 3.750 kr. \\n  3 hus => 10.000 kr. \\n  4 hus => 14.000 kr." +
                " \\n  Hotel => 18.000 kr. \\n" + hHTwo);
        // Bernstorffsvej
        String bernstorffsvej = rent +   "\\n grund => 300 kr. \\n  1 hus => 1.400 kr. \\n  2 hus => 4.000 kr. \\n  3 hus => 11.000 kr. \\n  4 hus => 15.000 kr." +
                " \\n  Hotel => 19.000 kr. \\n" + hHTwo;
        fields[16].setDescription(bernstorffsvej);
        // Hellerupvej
        fields[18].setDescription(bernstorffsvej);
        // Strandvejen
        fields[19].setDescription(rent +   "\\n grund => 350 kr. \\n  1 hus => 1.600 kr. \\n  2 hus => 4.400 kr. \\n  3 hus => 12.000 kr. \\n  4 hus => 16.000 kr." +
                " \\n  Hotel => 20.000 kr. \\n" + hHTwo);
        fields[20].setDescription("Gratis parkering");
        // Trianglen
        String trianglen = rent +   "\\n grund => 350 kr. \\n  1 hus => 1.800 kr. \\n  2 hus => 5.000 kr. \\n  3 hus => 14.000 kr. \\n  4 hus => 17.000 kr." +
                " \\n  Hotel => 21.000 kr. \\n" + hHThree;
        fields[21].setDescription(trianglen);
        // Østerbrogade
        fields[23].setDescription(trianglen);
        // Grønningen
        fields[24].setDescription(rent +   "\\n grund => 400 kr. \\n  1 hus => 2.000 kr. \\n  2 hus => 6.000 kr. \\n  3 hus => 15.000 kr. \\n  4 hus => 18.000 kr." +
                " \\n  Hotel => 22.000 kr. \\n" + hHThree);
        // Bredgade
        String bredgade = rent +   "\\n grund => 450 kr. \\n  1 hus => 2.200 kr. \\n  2 hus => 6.600 kr. \\n  3 hus => 16.000 kr. \\n  4 hus => 19.000 kr." +
                " \\n  Hotel => 23.000 kr. \\n" + hHThree;
        fields[26].setDescription(bredgade);

        // Kgs. Nytorv
        fields[27].setDescription(bredgade);

        // Coca Cola
        fields[28].setDescription("Hvis du ejer grunden, så skal du betale 100 gange så meget, som øjnene viser. \\n Hvis du både TURGORG SQUASH og Coca-Cola ejer, så er det 200 gange.");

        // Østergade
        fields[29].setDescription(rent +   "\\n grund => 500 kr. \\n  1 hus => 2.400 kr. \\n  2 hus => 7.200 kr. \\n  3 hus => 17.000 kr. \\n  4 hus => 20.000 kr." +
                " \\n  Hotel => 24.000 kr. \\n" + hHThree);
        fields[30].setDescription("Gå til fængsæl");

        // Amagertorv
        String amagertorv = rent +   "\\n grund => 550 kr. \\n  1 hus => 2.600 kr. \\n  2 hus => 7.800 kr. \\n  3 hus => 18.000 kr. \\n  4 hus => 22.000 kr." +
                " \\n  Hotel => 25.000 kr. \\n" + hHFour;

        fields[31].setDescription(amagertorv);
        // Vimmelskattet
        fields[32].setDescription(amagertorv);
        // Nygade
        fields[34].setDescription(rent +   "\\n grund => 600 kr. \\n  1 hus => 3.000 kr. \\n  2 hus => 9.000 kr. \\n  3 hus => 20.000 kr. \\n  4 hus => 24.000 kr." +
                " \\n  Hotel => 28.000 kr. \\n" + hHFour);

        // Frederiksberggade
        fields[37].setDescription(rent +   "\\n grund => 700 kr. \\n  1 hus => 3.500 kr. \\n  2 hus => 10.000 kr. \\n  3 hus => 22.000 kr. \\n  4 hus => 26.000 kr." +
                " \\n  Hotel => 30.000 kr. \\n" + hHFour);
        fields[38].setDescription("Betal indkomstskat: 10%, hvis pengebeholdningen er mindre end 40000 kr. Ellers 4.000 kr.");
        fields[39].setDescription(rent +   "\\n grund => 1.000 kr. \\n  1 hus => 4.000 kr. \\n  2 hus => 12.000 kr. \\n  3 hus => 28.000 kr. \\n  4 hus => 34.000 kr." +
                " \\n  Hotel => 40.000 kr. \\n" + hHFour);

        // færgerne
        String ferry = "Betal 4000 kr. for færgen";
        fields[5].setDescription(ferry);
        fields[15].setDescription(ferry);
        fields[25].setDescription(ferry);
        fields[35].setDescription(ferry);

        // prøv lykken
        String tryluck = "Prøv lykken";
        fields[2].setDescription(tryluck);
        fields[7].setDescription(tryluck);
        fields[17].setDescription(tryluck);
        fields[22].setDescription(tryluck);
        fields[33].setDescription(tryluck);
        fields[36].setDescription(tryluck);

    }
}

// commented because of limited time. unsure if this feature can be implemented in time.
// method for chooseing the property you want to sell, and selecting the player you want to sell to + the price.

//    public static int chooseSellProperty (HashMap<String, String> stringList, GUIBoardData[] boardData, GUI gui, Player currentPlayer, TileOwners owners, PropertyGroup[] propertyGroups){
//        int housePosition = -1;
//        int availableTiles = 0;
//        String[] tempStreetNames = new String[boardData.length];
//        for (int i = 0; i < boardData.length; i++) {
//            tempStreetNames[i] = " ";
//            if (currentPlayer.getPlayerNum() == owners.getTileOwner(i) && PropertyGroup.hasGroup(owners, currentPlayer, i, propertyGroups)) {
//                if ( (owners.getTileHotel(i) == 0) || (owners.getTileHotel(i) == 0) ){
//                    tempStreetNames[i] = boardData[i].getStreetName();
//                    availableTiles++;
//                }
//            }
//        }
//        // Filters out the empty strings
//        int k = 0;
//        String[] streetNames = new String[availableTiles];
//
//        for (int i = 0; i < boardData.length; i++) {
//            if (!tempStreetNames[i].equals(" ")) {
//                streetNames[k] = tempStreetNames[i];
//                k++;
//            }
//        }
//        if (availableTiles == 0) {
//            gui.showMessage(stringList.get("noSellableProperties"));
//        } else {
//            String propertyName = gui.getUserSelection(stringList.get("chooseSellableProperties"), streetNames);
//
//            for (int i = 0; i < boardData.length; i++) {
//                if (propertyName == boardData[i].getStreetName()) {
//                    housePosition = i;
//                    break;
//                }
//            }
//        }
//       return housePosition;
//    }
//
//public static int chooseSellPlayer (HashMap<String, String> stringList, GUI gui, GUI_Player[] guiPlayer) {
//
//    String playerNames = gui.getUserSelection(stringList.get("choosePlayers"), PlayerNames.playerNameList(guiPlayer));
//
//}
//    price = gui.getUserInteger(stringList.get("choosePlayers"));
//
