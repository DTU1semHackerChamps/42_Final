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
    GUI gui = new GUI();
    Dice dice = new Dice(0);
//
//    public void displayDice(){
//        GUI gui1 = new GUI();
//        gui1.showMessage("Press 'OK' to roll: ");
//        gui1.getUserLeftButtonPressed("right","Roll","left");
//
//        int dice1 = dice.rollDice();
//        int dice2 = dice.rollDice();
//        gui.setDice(dice1, dice2);
//
//    }


    public boolean rollScreen(GUI gui, String rollScreenMessage, String rollButton){
        boolean buttonPress;
        buttonPress = gui.getUserButtonPressed( rollScreenMessage, rollButton).equals(rollButton);
        return buttonPress;
    }

    public void displayDice(GUI gui, int dice1, int dice2){
        gui.setDice(dice1, dice2);

    }

    public GUI_Player displayAddPlayer(GUI gui, GUI_Field[] fields, String name, int balance, boolean color){
        GUI_Car car1 = new GUI_Car();
        if(color) {
            car1.setPrimaryColor(Color.blue);
        }
        else{
            car1.setPrimaryColor(Color.red);
        }
        GUI_Player gui_Player = new GUI_Player(name,balance, car1);
        gui.addPlayer(gui_Player);
        fields[1].setCar(gui_Player, true);

        return gui_Player;
    }


    public void displayPosition(GUI_Field[] fields, int positionPlayer1, int positionPlayer2, GUI_Player gui_Player1, GUI_Player gui_Player2){


        for (int i = 1; i < 16; i++) {
            if ((i == 4)||(i == 8)||(i == 12)) {

            } else {
                fields[i].removeAllCars();
            }
        }
        switch (positionPlayer1) {
            case 4:
            case 5:
            case 6: positionPlayer1 += 1;
                break;
            case 7:
            case 8:
            case 9: positionPlayer1 += 2;
                break;
            case 10:
            case 11:
            case 12: positionPlayer1 += 3;
                break;
        }

        switch (positionPlayer2) {
            case 4:
            case 5:
            case 6: positionPlayer2 += 1;
                break;
            case 7:
            case 8:
            case 9: positionPlayer2 += 2;
                break;
            case 10:
            case 11:
            case 12: positionPlayer2 += 3;
                break;

        }

        fields[positionPlayer1].setCar(gui_Player1, true);
        fields[positionPlayer2].setCar(gui_Player2, true);

    }
}
