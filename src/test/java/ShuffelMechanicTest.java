import Controller.ChanceCardController;
import Model.ChanceCards.ChanceCard;
import Model.ChanceCards.JailCards;
import Model.Player.Player;
import View.PlayerView;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShuffelMechanicTest {

    @Test
    public void cardShuffleMechanic(){

        Player[] players = Player.playerList(2);
        ChanceCard[] chanceCards1 = new ChanceCard[40];
        ChanceCard[] chanceCards2 = new ChanceCard[40];

        // Assigns the same integers to both chance card arrays;
        for (int i = 0; i < chanceCards1.length; i++) {
            String a = Integer.toString(i);
            chanceCards1[i] = new JailCards(players,a);
            chanceCards2[i] = new JailCards(players,a);
        }

        for (int i = 0; i < chanceCards1.length; i++) {
            //System.out.println(i);
            if(!chanceCards1[i].useChanceCard(players[0]).equals(chanceCards2[i].useChanceCard(players[0]))){
                break;
            }
        }

        int numOfEquals=0;

        for (int j = 0; j < 10000; j++) {
            // Shuffles both decks of cards.
            ChanceCardController.cardShuffle(chanceCards1);
            ChanceCardController.cardShuffle(chanceCards2);
            boolean a = false;

            // Checks for
            for (int i = 0; i < chanceCards1.length; i++) {
                if(!chanceCards1[i].useChanceCard(players[0]).equals(chanceCards2[i].useChanceCard(players[0]))){
                    a = true;
                    break;
                }
                numOfEquals++;
            }
            assertTrue(a);
        }
        System.out.println(numOfEquals);

    }
}
