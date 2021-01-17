package View;

import Model.BuildableTilePrices;
import Model.CompanyTilePrices;
import Model.GUIBoardData;
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
     * @return Returns gui with colors, names of the tiles and their prices.
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

    /**
     * This method displays four buttons with different choices and waits for participants to respond.
     * The stringList.get method takes the key-word as parameter and gets the phrase that located
     * underneath the key-word in the txt file.
     * @param gui the GUI package
     * @param stringList HashMap, contains a list of phrases .
     * @return participants input
     */

    public static String playerTurnMenu(GUI gui, HashMap<String, String> stringList, GUI_Player[] guiPlayer, int currentPlayerNum){
        String buttonPress;
        String screenMsg = guiPlayer[currentPlayerNum].getName() + stringList.get("playerTurnChoice");
        String buttonMsg = stringList.get("endTurnMsg");
        String buttonMsg1 = stringList.get("buyPropertyMsg");
        String buttonMsg2 = stringList.get("buildOnPropertyMsg");
        String buttonMsg3 = stringList.get("sellOnPropertyMsg");
        buttonPress = gui.getUserButtonPressed(screenMsg, buttonMsg, buttonMsg1, buttonMsg2, buttonMsg3 );
        return buttonPress;
    }

    public static void buyPropertyView(boolean isBought, GUI gui, HashMap<String,String> stringList){
        if(isBought){
            gui.showMessage(stringList.get("boughtPropertyMsg"));
        } else {
            gui.showMessage(stringList.get("notBoughtPropertyMsg"));
        }
    }

    public static void buyHouseView(boolean isBought, GUI gui, HashMap<String,String> stringList){
        if(isBought){
            gui.showMessage(stringList.get("boughtHouseMsg"));
        } else {
            gui.showMessage(stringList.get("notBoughtHouseMsg"));
        }
    }

}
