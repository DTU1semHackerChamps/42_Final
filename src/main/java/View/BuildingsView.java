package View;

import Model.TileOwners;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

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
}
