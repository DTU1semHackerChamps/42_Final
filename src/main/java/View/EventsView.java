package View;

import Model.BankruptPlayers;
import Model.GameEvents;
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

public class EventsView {

    public static boolean hasWon (BankruptPlayers bankruptPlayers, GUI gui){
        boolean endGame = false;
        int i = GameEvents.whoWon(bankruptPlayers);
        if(i != -1) {
            gui.showMessage("Spiller" + i);
            endGame = true;
        }
        return endGame;
    }

}
