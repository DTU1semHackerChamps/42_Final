package View;

import Model.BuildableTilePrices;
import Model.CompanyTilePrices;
import Model.GUIBoardData;
import Model.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;
import java.util.HashMap;

public class BoardView {

    /**
     * This method initializes the board and has switch case that determines the color of the tile.
     * It also has an if statement that checks for tiles with 0 rent and removes the subtext,
     * and a special one for the prison/visit prison.
     *
     * @param stringList is the names of the tiles taken form a list of strings in the Language class.
     * @param fields     is the current GUI_Field[]
     * @return Returns gui with monopoly_junior.Tile names, monopoly_junior.Tile balance
     * and specific colors for the tiles and background
     */
    public static GUI initBoard(HashMap<String, String> stringList, GUI_Field[] fields, GUIBoardData[] boardData, BuildableTilePrices[] propertyPrice, CompanyTilePrices[] priceOfCompany) {

        GUI.setNull_fields_allowed(true);
        int tileBalance = 0;
        int tileCompany = 0;
        String tileName;
        float H, S, B;


        for (int i = 0; i < boardData.length; i++) {


            tileBalance = propertyPrice[i].getPropertyPrice();
            tileName = boardData[i].getStreetName();
            tileCompany = priceOfCompany[i].getPriceOfCompany();


            GUI_Street street = new GUI_Street();
            street.setTitle(tileName);
            if (tileBalance == 0 && tileCompany == 0) {
                street.setSubText("");
                if (tileName == boardData[10].getStreetName()) {
                    street.setTitle(tileName);
                    street.setSubText(stringList.get("VisitJailField"));
                }

            } else if (tileCompany > 0) {
                street.setSubText("kr. " + tileCompany);

            } else {
                street.setSubText("kr. " + tileBalance);
            }
            street.setDescription(" ");

            H = boardData[i].getHue();
            S = boardData[i].getSat();
            B = boardData[i].getBright();

            fields[i] = street;
            fields[i].setBackGroundColor(Color.getHSBColor(H, S, B));
        }

        GUI gui = new GUI(fields, Color.getHSBColor((float) 0.355, (float) 0.19, (float) 0.87));


        return gui;

    }

    public static void  updatePlayerBalance(GUI gui, GUI_Player[] guiPlayer, Player[] players){
        for (int i = 0; i < players.length; i++) {
            guiPlayer[i].setBalance(players[i].getBalance());
        }

    }

}
