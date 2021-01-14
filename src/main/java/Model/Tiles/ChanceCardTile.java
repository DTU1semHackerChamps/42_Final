package Model.Tiles;

import Model.Dice;
import Model.Player;

public class ChanceCardTile extends Tile{
    public ChanceCardTile(Player currentPlayer, Player[] players) {
        super(currentPlayer, players);
    }

    @Override
    public void executeTile() {
        Dice dice = new Dice(0);
        int SumOfFaceValue = dice.rollDice() + dice.rollDice();
        currentPlayer.setPosition(currentPlayer.getPosition()+ SumOfFaceValue);

    }
}
