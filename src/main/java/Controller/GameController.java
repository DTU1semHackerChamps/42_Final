package Controller;

import Model.BuildableTilePrices;
import Model.GUIBoardData;
import Model.Language;
import Model.Player;
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
        Player[] players = Player.playerList(PlayerView.getNumberOfPlayers);

    }

}
