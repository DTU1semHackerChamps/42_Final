package Model.Tiles;

import Model.Dice;
import Model.Player;

public class ChanceCardTile extends Tile{
    public ChanceCardTile(Player currentPlayer, Player[] players) {
        super(currentPlayer, players);
    }

    @Override
    public void executeTile() {

        boolean isItChanceCard = true;
        while (isItChanceCard) {
            Dice dice = new Dice(0);
            int SumOfFaceValue = dice.rollDice() + dice.rollDice();
            currentPlayer.setPosition(currentPlayer.getPosition()+ SumOfFaceValue);
            switch (currentPlayer.getPosition()) {
                case 2: case 7: case 17:
                case 22: case 33: case 36:
                    break;
                default: isItChanceCard = false;
            }
        }

    }
}
