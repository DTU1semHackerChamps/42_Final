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

import Model.Dice;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;

import static java.lang.Integer.parseInt;

public class PlayerView {



    public static boolean rollScreen(GUI gui, String rollScreenMessage, String rollButton){
        boolean buttonPress;
        buttonPress = gui.getUserButtonPressed( rollScreenMessage, rollButton).equals(rollButton);
        return buttonPress;
    }

    public static void displayDice(GUI gui,int dice1, int dice2){
        gui.setDice(dice1,5,1, dice2,6,1);


    }

    public static int getParticipants(GUI gui, HashMap<String, String> stringList) {
        String a = gui.getUserButtonPressed(stringList.get("numberChoiceMsg"), "2", "3", "4", "5", "6");
        int numOfPlayers = parseInt(a,10);
        return numOfPlayers;
    }

    public static GUI_Player[] displayAddPlayer(HashMap<String, String> stringList, GUI gui, GUI_Field[] fields, Player[] player){



        int numOfPlayers = player.length;

        GUI_Player[] guiPlayerList = new GUI_Player[numOfPlayers];


        for (int i = 0; i <numOfPlayers; i++) {
            GUI_Car carColor = new GUI_Car();

           switch (i) {
               case 0: carColor.setPrimaryColor(Color.green); break;
               case 1: carColor.setPrimaryColor(Color.red); break;
               case 2: carColor.setPrimaryColor(Color.yellow); break;
               case 3: carColor.setPrimaryColor(Color.black); break;
               case 4: carColor.setPrimaryColor(Color.blue); break;
               case 5: carColor.setPrimaryColor(Color.gray); break;

           }

            String name = gui.getUserString(stringList.get("writeNameMsg"));
            GUI_Player gui_Player = new GUI_Player(name, player[i].getBalance(),carColor );

            gui.addPlayer(gui_Player);
            fields[0].setCar(gui_Player, true);
            guiPlayerList[i] = gui_Player;

        }

        return guiPlayerList;
    }


}
