package View;

import Model.BuildableTilePrices;
import Model.GUIBoardData;
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
    public static GUI initBoard(HashMap<String, String> stringList, GUI_Field[] fields, GUIBoardData[] boardData, BuildableTilePrices[] propertyPrice){

        GUI.setNull_fields_allowed(true);
        int tileBalance = 0;
        String tileName;
        float H, S, B ;

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

        for (int i = 0; i < boardData.length; i++) {


            tileBalance = propertyPrice[i].getPropertyPrice();
            tileName = boardData[i].getStreetName();

            GUI_Street street = new GUI_Street();
            street.setTitle(tileName);
            if(tileBalance == 0){
                street.setSubText("");
                if(tileName == boardData[10].getStreetName()){
                    street.setTitle(tileName);
                    street.setSubText(stringList.get("VisitJailField"));
                }
            }else {
                street.setSubText("kr. " + tileBalance);
            }
            street.setDescription(" ");

            H = boardData[i].getHue();
            S = boardData[i].getSat();
            B = boardData[i].getBright();

            fields[i] = street;
            fields[i].setBackGroundColor(Color.getHSBColor(H,S,B));
        }

        GUI gui = new GUI(fields,Color.getHSBColor((float)0.355,(float)0.19,(float)0.87));


        return gui;

    }

}
