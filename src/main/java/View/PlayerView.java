package View;

import Model.Player.Player;
import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;
import gui_fields.GUI_Field;

import java.awt.*;
import java.util.HashMap;

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

    /**
     * The outer for-loop invokes all the tiles and the inner for-loop invokes all the participants (2-6).
     * And as a tile occurs, the if statement in the scope of the inner loop sets the players' position.
     * @param fields The GUI_Field[] array.
     * @param gui_Players The GUI_Player[] array.
     * @param players Player array.
     */

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

    /**
     * This method displays the face-value on the screen and it takes two parameters.
     * @param gui the GUI package.
     * @param dice1 face-value1
     * @param dice2 face-value2
     */
    public static void displayDice(GUI gui,int dice1, int dice2){

        int max = 9;
        int x1 = (int) (Math.random() * max) + 1;
        int y1 = 2;
        int x2 = (int) (Math.random() * max) + 1;
        int y2 = 3;

        gui.setDice(dice1,x1,y1,dice2,x2,y2);

    }

    /**
     * This method displays a message and waits for player to response by clicking the button,
     * afterwards sends back a boolean value.
     * @param gui the GUI package.
     * @param stringList the message strings from the Hashmap displayed on the screen GUI.
     * @param guiPlayers to get the players name for the turn
     * @param currentPlayerNum the current player number
     * @return
     */
    public static boolean rollScreen(GUI gui, HashMap<String, String> stringList, GUI_Player[] guiPlayers, int currentPlayerNum){
        boolean buttonPress;
        String rollScreenMessage = guiPlayers[currentPlayerNum].getName() + stringList.get("rollScreenMessage");
        String rollButton = stringList.get("rollButton");
        buttonPress = gui.getUserButtonPressed( rollScreenMessage, rollButton).equals(rollButton);
        return buttonPress;
    }

    /**
     * The for-loop is responsible to call all the players and as the players occur one by one sets their new positions.
     * @param gui_players the gui_players array.
     * @param players Players array.
     */
    public static void updateBalances(GUI_Player[] gui_players, Player[] players) {
        for (int i = 0; i < players.length; i++) {
            int balance = players[i].getBalance();
            gui_players[i].setBalance(balance);
        }
    }

}
