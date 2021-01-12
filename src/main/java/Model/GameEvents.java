package Model;

import Model.BuildableTilePrices;
import Model.CompanyTilePrices;
import Model.GUIBoardData;
import Model.Player;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;
import java.util.HashMap;

public class GameEvents
{

    public static boolean whoWon(Player[] players, boolean [] bankruptPlayers) {
        int highBalance = 0;
        int highBalance2 = 0;
        int winner = 0;

        for (int i = 0; i < players.length; i++)
        {
            int currentBalance = players[i].getBalance();
            if (currentBalance <= 0)
            {
                bankruptPlayers[i] = true;
            }
        }


    }
}
