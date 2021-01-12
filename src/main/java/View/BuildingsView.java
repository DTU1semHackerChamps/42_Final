package View;

import Model.*;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.io.IOException;
import java.util.HashMap;

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

    /**
     * Dropdown menu with all available street names for the current player, to select the location for building houses or a hotel.
     * All streetnames are assigned to a String array, and there after the position of the streetname is found.
     * @param boardData
     * @param gui
     * @return int value of the property position on the game board.
     */
    public static int buildingAvailability(HashMap<String, String> stringList,GUIBoardData[] boardData, GUI gui, Player currentPlayer, TileOwners owners, PropertyGroup[] propertyGroups){
        int propertyPosition = 0;
        String[] tempStreetNames = new String[boardData.length];
        int availableTiles = 0;
        for (int i = 0; i < boardData.length; i++) {
            tempStreetNames[i] = " ";
            if((currentPlayer.getPlayerNum() == owners.getTileOwner(i) && PropertyGroup.hasGroup(owners,currentPlayer, i, propertyGroups))) {
                tempStreetNames[i] = boardData[i].getStreetName();
                availableTiles++;
            }
        }

        int k = 0;
        String[] streetNames = new String [availableTiles];
        for (int i = 0; i < boardData.length; i++) {
            if(!tempStreetNames[i].equals(" ")){
                streetNames[k] = tempStreetNames[i];
                k++;
            }
        }

        String propertyName = gui.getUserSelection(stringList.get("chooseBuildingProperty"), streetNames);

        for (int i = 0; i < boardData.length; i++) {
            if(propertyName == boardData[i].getStreetName()){
                propertyPosition = i;
                break;
            }

        }
        return propertyPosition;
    }
}
