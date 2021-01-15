package View;

import Model.*;
import gui_fields.GUI_Player;
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
