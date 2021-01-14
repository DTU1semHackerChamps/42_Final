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
}


