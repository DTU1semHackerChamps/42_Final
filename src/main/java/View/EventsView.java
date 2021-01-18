package View;

import Model.Player.BankruptPlayers;
import Model.GameEvents;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.util.HashMap;

public class EventsView {


    public static boolean hasWon (HashMap<String,String> stringList, BankruptPlayers bankruptPlayers, GUI gui, GUI_Player[] guiPlayer){
        boolean endGame = false;
        int i = GameEvents.whoWon(bankruptPlayers);
        if(i != -1) {
            gui.showMessage(guiPlayer[i].getName() + stringList.get("winMessage"));
            endGame = true;
        }
        return endGame;
    }

    public static void chanceCardMsg(String chanceCardKeyWord, GUI gui,HashMap<String,String> stringList){
        gui.showMessage(stringList.get(chanceCardKeyWord));
    }

    public static void goToJailMsg(HashMap<String,String> stringList, GUI gui, GUI_Player[] guiPlayer, int currentPlayerNum){
        String goToJailMsg = guiPlayer[currentPlayerNum].getName() + stringList.get("goToJailMsg");
        gui.showMessage(goToJailMsg);
    }

}
