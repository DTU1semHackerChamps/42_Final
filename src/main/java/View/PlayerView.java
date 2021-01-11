package View;

import Model.Player;
import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;
import gui_fields.GUI_Street;
import gui_fields.GUI_Field;
import gui_fields.GUI_Board;

import java.awt.*;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class PlayerView {
    /**
     * This method is used to add a GUI_Player to the GUI and it also initializes and returns that GUI_Player
     * @param stringList is the names of the characters taken form a list of strings
     * @param gui The current GUI
     * @param fields The current GUI_Field[]
     * @param player The name displayed in the GUI by the score
     * @return
     */
    public static GUI_Player[] displayAddPlayer(HashMap<String, String> stringList, GUI gui, GUI_Field[] fields, Player[] player){


        GUI_Player[] guiPlayerList = new GUI_Player[4];

        for (int i = 0; i < player.length; i++) {
            GUI_Car carColor = new GUI_Car();

            GUI_Player gui_Player = new GUI_Player(gui.getUserString("Skriv navn her: ") ,player[i].getBalance(), carColor);
            gui.addPlayer(gui_Player);
            fields[0].setCar(gui_Player, true);
            guiPlayerList[i] = gui_Player;
        }

        return guiPlayerList;
    }
}
