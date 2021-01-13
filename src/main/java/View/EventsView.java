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

public String displayWinner(GameEvents winningPlayerNum,BankruptPlayers bankruptPlayers,PlayerNames names, GUI gui){

    String playerName = Player.getPlayerNum(GameEvents.whoWon(bankruptPlayers ,names));
//    String playerName = PlayerNames.getPlayerName(GameEvents.whoWon(bankruptPlayers ,names));
    String displayWinner = gui.showMessage("tillykke " + playerName,);


   return displayWinner;
}

}
