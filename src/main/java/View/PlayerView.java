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
     * This method is used to add a GUI_Player to the GUI and it also initializes and returns that GUI_Player.
     * Each player hase a designated color.
     * @param stringList is the message for character creation
     * @param gui The current GUI
     * @param fields The current GUI_Field[]
     * @param player The name displayed in the GUI by the score
     * @return
     */
    public static GUI_Player[] displayAddPlayer(HashMap<String, String> stringList, GUI gui, GUI_Field[] fields, Player[] player){
        int numOfPlayers = player.length;
        GUI_Player[] guiPlayerList = new GUI_Player[numOfPlayers];

        for (int i = 0; i < player.length; i++) {
            GUI_Car carColor = new GUI_Car();

            switch (i) {
                case 0: carColor.setPrimaryColor(Color.green); break;
                case 1: carColor.setPrimaryColor(Color.red); break;
                case 2: carColor.setPrimaryColor(Color.yellow); break;
                case 3: carColor.setPrimaryColor(Color.black); break;
                case 4: carColor.setPrimaryColor(Color.blue); break;
                case 5: carColor.setPrimaryColor(Color.gray); break;

            }

            String name = gui.getUserString(stringList.get("writeNameMsg") + " " + (i + 1));
            GUI_Player gui_Player = new GUI_Player(name, player[i].getBalance(), carColor);

            gui.addPlayer(gui_Player);
            fields[0].setCar(gui_Player, true);
            guiPlayerList[i] = gui_Player;
        }

        return guiPlayerList;
    }

    /**
     * Creates 5 buttons on the GUI to select the number of players.
     * @param gui The current GUI
     * @param stringList is the message for choosing the playernumber
     * @return An integer value of the number of players
     */
    public static int getNumberOfPlayers(GUI gui, HashMap<String, String> stringList){
        int numberOfPlayers = Integer.parseInt(gui.getUserButtonPressed(stringList.get("ChoosePlayers"), "2", "3", "4", "5", "6"),10);;

        return numberOfPlayers;
    }

    public static void updatePosition(GUI_Field[] fields, GUI_Player[] gui_Players, Player[] players) {

        for (int i = 0; i < fields.length; i++) {
            fields[i].removeAllCars();

            for (int j = 0; j < gui_Players.length; j++) {

                if (players[j].getPosition() == i) {
                    fields[i].setCar(gui_Players[j], true);
                }

            }
        }

    }

    public static void displayDice(GUI gui,int dice1, int dice2){
        //gui.setDice(dice1,dice2);
        gui.setDice(dice1,5,1,dice2,6,1);


    }

    public static boolean rollScreen(GUI gui, String rollScreenMessage, String rollButton){
        boolean buttonPress;
        buttonPress = gui.getUserButtonPressed( rollScreenMessage, rollButton).equals(rollButton);
        return buttonPress;
    }

    public static void updateBalances(GUI_Player[] gui_players, Player[] players) {
        for (int i = 0; i < players.length; i++) {
            int balance = players[i].getBalance();
            gui_players[i].setBalance(balance);
        }
    }

}
