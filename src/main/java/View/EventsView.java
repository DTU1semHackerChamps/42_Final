package View;

import Model.*;
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

public static void displayWinner(GameEvents winningPlayerNum,BankruptPlayers bankruptPlayers,PlayerNames names, GUI gui){

//    String playerName = PlayerNames.getPlayerName(GameEvents.whoWon(bankruptPlayers ,names));
    gui.showMessage("tillykke " + "spiller" + GameEvents.whoWon(bankruptPlayers ,names));

}

}
