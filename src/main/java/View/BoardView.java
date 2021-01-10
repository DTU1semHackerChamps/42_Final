package View;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;
import java.util.HashMap;

public class BoardView {

    /**
     * This method initializes the board and has switch case that determines the color of the tile.
     * It also has an if statement that checks for tiles with 0 rent and removes the subtext,
     * and a special one for the prison/visit prison.
     * @param stringList is the names of the tiles taken form a list of strings in the Language class.
     * @param fields is the current GUI_Field[]
     * @return Returns gui with monopoly_junior.Tile names, monopoly_junior.Tile balance
     * and specific colors for the tiles and background
     */
    public static GUI initBoard(HashMap<String, String> stringList, GUI_Field[] fields){

        GUI.setNull_fields_allowed(true);
        Tile[] tiles = Tile.tileListInit(stringList);
        String tileBalance, tileName;
        float H = 0, S = 0,B = 0;

        /* HSB colors
        BoardBackground H:0.35f S:0.19f B:0.87f
        0 : White H = 0.5f; S = 0f; B = 0.98f;
        1 : Brown H = 0.05f; S = 0.64f; B = 0.58f;
        2 : LightBlue H = 0.56f; S = 0.27f; B = 0.96f;
        3 : Magenta H = 0.91f; S = 0.67f; B = 0.83f;
        4 : Orange H = 0.09f; S = 0.87f; B = 0.97f;
        5 : Red H = 1.00f; S = 0.85f; B = 0.94f;
        6 : Yellow H = 0.15f; S = 0.83f; B = 0.98f;
        7 : Green H = 0.37f; S = 0.76f; B = 0.66f;
        8 : Blue H = 0.57f; S = 0.92f; B = 0.72f;

         */

        for (int i = 0; i < tiles.length; i++) {


            tileBalance = Integer.toString(tiles[i].getBalanceChange());
            tileName = tiles[i].getTileName();

            switch (tiles[i].getColor()){
                case 0 :H = 0.5f; S = 0f; B = 0.98f;
                    break;
                case 1 :H = 0.05f; S = 0.64f; B = 0.58f;
                    break;
                case 2 :H = 0.56f; S = 0.27f; B = 0.96f;
                    break;
                case 3 :H = 0.91f; S = 0.67f; B = 0.83f;
                    break;
                case 4 :H = 0.09f; S = 0.87f; B = 0.97f;
                    break;
                case 5 :H = 1.00f; S = 0.85f; B = 0.94f;
                    break;
                case 6 :H = 0.15f; S = 0.83f; B = 0.98f;
                    break;
                case 7 :H = 0.37f; S = 0.76f; B = 0.66f;
                    break;
                case 8 :H = 0.57f; S = 0.92f; B = 0.72f;
                    break;

            }

            GUI_Street street = new GUI_Street();
            street.setTitle(tileName);
            if(tileBalance.equals(Integer.toString(tiles[3].getBalanceChange()))){
                street.setSubText("");
                if(tileName == tiles[6].getTileName()){
                    street.setTitle(tileName);
                    street.setSubText(stringList.get("VisitJailField"));
                }
            }else {
                street.setSubText("M" + tileBalance);
            }
            street.setDescription(" ");

            fields[i] = street;
            fields[i].setBackGroundColor(Color.getHSBColor(H,S,B));
        }

        GUI gui = new GUI(fields,Color.getHSBColor((float)0.355,(float)0.19,(float)0.87));


        return gui;

    }

}
