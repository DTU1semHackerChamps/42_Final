package Controller;

import Model.*;
import View.BoardView;
import View.PlayerView;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.io.IOException;
import java.util.HashMap;

public class GameController {

    public static void main(String[] args) throws IOException {
        // loads the file of the corresponding language input string
        HashMap<String, String> stringList = Language.languageInit("Danish");

        GUI_Field[] fields = new GUI_Field[40];


        GUI gui = BoardView.initBoard(stringList, fields, GUIBoardData.tilesData(stringList), BuildableTilePrices.tilesData());

        // Currentplayer is used to decide which player is rolling the dice and affected by the balance change, position change and extra turn





        Dice dice = new Dice(0);

        PlayerView playerView = new PlayerView();
        GUI gui2 = new GUI();



        playerView.rollScreen(gui2, "Press 'Roll' to roll: ", "Roll");
        playerView.displayDice(gui2, dice.rollDice(), dice.rollDice());


        Player player2 = new Player(1000, 1,  gui.getUserString(stringList.get("typeName1")),false, 1);
        Player player1 = new Player(1000, 1,  gui.getUserString(stringList.get("typeName2")), false, 2);

        GUI_Player gui_Player1 = playerView.displayAddPlayer(gui, fields, player1.getPlayerName(), player1.getBalance(), true);
        GUI_Player gui_Player2 = playerView.displayAddPlayer(gui, fields, player2.getPlayerName(), player2.getBalance(), false);


        playerView.displayPosition(fields, 1,2, gui_Player1, gui_Player2);




    }

}
