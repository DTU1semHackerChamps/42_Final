package Model;

import java.awt.*;

public class PlayerColor {

    private Color color;

    public PlayerColor(Color color) {
        this.color = color;
    }


    public void setColors(Color[] colors) {
        this.color = color;
    }


    /**
     * array of colors, for each player
     * @return initPlayerColor
     */
    public static PlayerColor[] initPlayerColor (){
        PlayerColor[] initPlayerColor = new PlayerColor[6];

        initPlayerColor[0] = new PlayerColor(Color.green);
        initPlayerColor[1] = new PlayerColor(Color.red);
        initPlayerColor[2] = new PlayerColor(Color.yellow);
        initPlayerColor[3] = new PlayerColor(Color.black);
        initPlayerColor[4] = new PlayerColor(Color.blue);
        initPlayerColor[5] = new PlayerColor(Color.gray);

        return initPlayerColor;
    }

    public Color getColor() {
        return color;
    }
}
