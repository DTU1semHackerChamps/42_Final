package Controller;

import Model.*;
import View.BoardView;
import View.BuildingsView;
import View.PlayerView;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.io.IOException;
import java.util.HashMap;

public class GameController {

    public static void main(String[] args) throws IOException {
        // loads the file of the corresponding language input string
        HashMap<String, String> stringList = Language.languageInit("Danish");
        GUI_Street[] fields = new GUI_Street[40];

        GUI gui = BoardView.initBoard(stringList, fields, GUIBoardData.tilesData(stringList), BuildableTilePrices.tilesData(), CompanyTilePrices.companyData());

        // Currentplayer is used to decide which player is rolling the dice and affected by the balance change, position change and extra turn
        Player[] players = Player.playerList(PlayerView.getNumberOfPlayers(gui, stringList));

        GUI_Player[] gui_players = PlayerView.displayAddPlayer(stringList, gui, fields, players);
        // test af stuff fra linje 29- 37
        while (true) {
            players[0].setPosition(5);
            PlayerView.updatePosition(fields, gui_players, players);
            players[1].addBalance(-5000);
            PlayerView.updateBalances(gui_players, players);
            int position = BuildingsView.buildingAvailability(GUIBoardData.tilesData(stringList),gui);
            System.out.println(position);
            BoardView.getEndOfTurn(gui, stringList);
        }
    }

}
