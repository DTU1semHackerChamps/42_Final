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

    public static PlayerColor[] initPlayerColor (){
        PlayerColor[] initPlayerColor = new PlayerColor[7];

        initPlayerColor[1] = new PlayerColor(Color.green);
        initPlayerColor[2] = new PlayerColor(Color.red);
        initPlayerColor[3] = new PlayerColor(Color.yellow);
        initPlayerColor[4] = new PlayerColor(Color.black);
        initPlayerColor[5] = new PlayerColor(Color.blue);
        initPlayerColor[6] = new PlayerColor(Color.gray);

        return initPlayerColor;
    }

    public Color getColor() {
        return color;
    }
}
