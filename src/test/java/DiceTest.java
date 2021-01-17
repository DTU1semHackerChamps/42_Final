import Model.Dice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest {

    //tests the probability of getting 1-6 in 60000 instances with a delta of 400.
    @Test
    void diceRandomness() {
        Dice testdice = new Dice(6);

        int[] dicesidestest = new int[6];

        for (int i = 0; i < 60000; i++) {
            testdice.rollDice();
            int facevalue = testdice.getFaceValue();

            switch (facevalue) {
                case 1:
                    dicesidestest[0]++;
                    break;
                case 2:
                    dicesidestest[1]++;
                    break;
                case 3:
                    dicesidestest[2]++;
                    break;
                case 4:
                    dicesidestest[3]++;
                    break;
                case 5:
                    dicesidestest[4]++;
                    break;
                case 6:
                    dicesidestest[5]++;
                    break;
            }

        }

        System.out.println("Dice facevalue results 1-6: ");
        System.out.println(dicesidestest[0]);
        System.out.println(dicesidestest[1]);
        System.out.println(dicesidestest[2]);
        System.out.println(dicesidestest[3]);
        System.out.println(dicesidestest[4]);
        System.out.println(dicesidestest[5]);

        for (int i = 0; i < 5; i++) {
            assertEquals(10000, dicesidestest[i], 400);

        }
    }
    // tests that our string with the rolldice result works properly
    @Test
    void sumOfDiceRange() {
        Dice testDice1 = new Dice(6);
        Dice testDice2 = new Dice(6);

        for (int i = 0; i < 100000; i++) {

            testDice1.rollDice();
            testDice2.rollDice();
            int sumOfDice = testDice1.getFaceValue() + testDice2.getFaceValue();
            // Checking for the sumOfDice to be within +/- 5 of 7 that means between 2-12.
            assertEquals(7,sumOfDice, 5);
            assertTrue((sumOfDice >= 2) && (sumOfDice <= 12));
        }



    }
}
