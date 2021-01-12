package View;

import Model.GUIBoardData;
import Model.TileOwners;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;

public class BuildingsView {

    /**
     * Methode for updating the amount of buildings on a street.
     * @param streets
     * @param owners
     */
    public static void updateBuildings(GUI_Street[] streets, TileOwners owners){
        for (int i = 0; i < streets.length; i++) {
            streets[i].setHouses(owners.getTileHouses(i));
            if (owners.getTileHotel(i) == 1){
                streets[i].setHotel(true);
            } else {
                streets[i].setHotel(false);
            }
        }

    }

    public static int buildingAvailability(GUIBoardData[] boardData, GUI gui){
        int propertyPosition = 0;
        String[] streetNames = new String[boardData.length];
        String tempNames = "";
        for (int i = 0; i < boardData.length; i++) {
            streetNames[i] = boardData[i].getStreetName();
        }

        String propertyName = gui.getUserSelection("vælg grund", streetNames);


        for (int i = 0; i < boardData.length; i++) {
            if(propertyName == boardData[i].getStreetName()){
                propertyPosition = i;
                break;
            }

        }
        return propertyPosition;
    }
}
