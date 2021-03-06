package Model;

import java.util.HashMap;

public class GUIBoardData {

    private String streetName;
    private String tileDescription;
    private float hue, sat, bright;

    /**
     * Constructor for GUIBoardData used in the BoardView class
     * @param streetName the name of the street on the individual tiles
     * @param tileDescription description is current not used
     * @param hue the hue for coloring the individual tiles
     * @param sat the saturation for coloring the individual tiles
     * @param bright the brightness for coloring the individual tiles
     */
    public GUIBoardData(String streetName, String tileDescription, float hue, float sat, float bright){
        this.streetName = streetName;
        this.tileDescription = tileDescription;
        this.hue = hue;
        this.sat = sat;
        this.bright = bright;

    }

    public String getStreetName() {
        return streetName;
    }

    public String getTileDescription() {
        return tileDescription;
    }

    public float getHue() {
        return hue;
    }

    public float getSat() {
        return sat;
    }

    public float getBright() {
        return bright;
    }


    /**
     * Data object, an array of names, descriptions and HSB colors for the initBoard method in BoardView.
     * @param stringList Collects the respective names form a .txt file.
     * @return The array data for the initBoard method.
     */
    public static GUIBoardData [] tilesGUIData(HashMap<String, String> stringList){
        GUIBoardData[] tilesGUIData = new GUIBoardData[40];


        tilesGUIData[0] = new GUIBoardData(stringList.get("tileName0"), stringList.get("tileDesc0"), 0f,1f,1f); //start red
        tilesGUIData[1] = new GUIBoardData(stringList.get("tileName1"), stringList.get("tileDesc1"), 0.58f,0.66f,0.88f); //blue
        tilesGUIData[2] = new GUIBoardData(stringList.get("tileName2"), stringList.get("tileDesc2"), 0f,0f,0.8f); //chanceCard
        tilesGUIData[3] = new GUIBoardData(stringList.get("tileName3"), stringList.get("tileDesc3"), 0.58f,0.66f,0.88f); //blue
        tilesGUIData[4] = new GUIBoardData(stringList.get("tileName4"), stringList.get("tileDesc4"), 0f,0f,0.5f); //neutralTiles
        tilesGUIData[5] = new GUIBoardData(stringList.get("tileName5"), stringList.get("tileDesc5"), 0.5f,0.19f,0.88f); //blueFerry
        tilesGUIData[6] = new GUIBoardData(stringList.get("tileName6"), stringList.get("tileDesc6"), 0.02f,0.52f,1f); //orange
        tilesGUIData[7] = new GUIBoardData(stringList.get("tileName7"), stringList.get("tileDesc7"), 0f,0f,0.8f); //chanceCard
        tilesGUIData[8] = new GUIBoardData(stringList.get("tileName8"), stringList.get("tileDesc8"), 0.02f,0.52f,1f); //orange
        tilesGUIData[9] = new GUIBoardData(stringList.get("tileName9"), stringList.get("tileDesc9"), 0.02f,0.52f,1f); //orange
        tilesGUIData[10] = new GUIBoardData(stringList.get("tileName10"), stringList.get("tileDesc10"), 0f,0f,0.49f); //jail
        tilesGUIData[11] = new GUIBoardData(stringList.get("tileName11"), stringList.get("tileDesc11"), 0.25f,1f,0.8f); //green
        tilesGUIData[12] = new GUIBoardData(stringList.get("tileName12"), stringList.get("tileDesc12"), 0.01f,0.81f,0.58f); //brewery
        tilesGUIData[13] = new GUIBoardData(stringList.get("tileName13"), stringList.get("tileDesc13"), 0.25f,1f,0.8f); //green
        tilesGUIData[14] = new GUIBoardData(stringList.get("tileName14"), stringList.get("tileDesc14"), 0.25f,1f,0.8f); //green
        tilesGUIData[15] = new GUIBoardData(stringList.get("tileName15"), stringList.get("tileDesc15"), 0.5f,0.19f,0.88f); //blueFerry
        tilesGUIData[16] = new GUIBoardData(stringList.get("tileName16"), stringList.get("tileDesc16"), 0f,0f,0.6f); //grey
        tilesGUIData[17] = new GUIBoardData(stringList.get("tileName17"), stringList.get("tileDesc17"), 0f,0f,0.8f); //chanceCard
        tilesGUIData[18] = new GUIBoardData(stringList.get("tileName18"), stringList.get("tileDesc18"), 0f,0f,0.6f); //grey
        tilesGUIData[19] = new GUIBoardData(stringList.get("tileName19"), stringList.get("tileDesc19"), 0f,0f,0.6f); //grey
        tilesGUIData[20] = new GUIBoardData(stringList.get("tileName20"), stringList.get("tileDesc20"), 0f,0f,0.5f); //neutralTiles
        tilesGUIData[21] = new GUIBoardData(stringList.get("tileName21"), stringList.get("tileDesc21"), 0f,1f,1f); //red
        tilesGUIData[22] = new GUIBoardData(stringList.get("tileName22"), stringList.get("tileDesc22"), 0f,0f,0.8f); //chanceCard
        tilesGUIData[23] = new GUIBoardData(stringList.get("tileName23"), stringList.get("tileDesc23"), 0f,1f,1f); //red
        tilesGUIData[24] = new GUIBoardData(stringList.get("tileName24"), stringList.get("tileDesc24"), 0f,1f,1f); //red
        tilesGUIData[25] = new GUIBoardData(stringList.get("tileName25"), stringList.get("tileDesc25"), 0.5f,0.19f,0.88f); //blueFerry
        tilesGUIData[26] = new GUIBoardData(stringList.get("tileName26"), stringList.get("tileDesc26"), 0f,0f,1f); //white
        tilesGUIData[27] = new GUIBoardData(stringList.get("tileName27"), stringList.get("tileDesc27"), 0f,0f,1f); //white
        tilesGUIData[28] = new GUIBoardData(stringList.get("tileName28"), stringList.get("tileDesc28"), 0.01f,0.81f,0.58f); //brewery
        tilesGUIData[29] = new GUIBoardData(stringList.get("tileName29"), stringList.get("tileDesc29"), 0f,0f,1f); //white
        tilesGUIData[30] = new GUIBoardData(stringList.get("tileName30"), stringList.get("tileDesc30"), 0f,0f,0.49f); //jail
        tilesGUIData[31] = new GUIBoardData(stringList.get("tileName31"), stringList.get("tileDesc31"), 0.17f,0.8f,1f); //yellow
        tilesGUIData[32] = new GUIBoardData(stringList.get("tileName32"), stringList.get("tileDesc32"), 0.17f,0.8f,1f); //yellow
        tilesGUIData[33] = new GUIBoardData(stringList.get("tileName33"), stringList.get("tileDesc33"), 0f,0f,0.8f); //chanceCard
        tilesGUIData[34] = new GUIBoardData(stringList.get("tileName34"), stringList.get("tileDesc34"), 0.17f,0.8f,1f); //yellow
        tilesGUIData[35] = new GUIBoardData(stringList.get("tileName35"), stringList.get("tileDesc35"), 0.5f,0.19f,0.88f); //blueFerry
        tilesGUIData[36] = new GUIBoardData(stringList.get("tileName36"), stringList.get("tileDesc36"), 0f,0f,0.8f); //chanceCard
        tilesGUIData[37] = new GUIBoardData(stringList.get("tileName37"), stringList.get("tileDesc37"), 0.83f,0.6f,0.58f); //purple
        tilesGUIData[38] = new GUIBoardData(stringList.get("tileName38"), stringList.get("tileDesc38"), 0f,0f,0.5f); //neutralTiles
        tilesGUIData[39] = new GUIBoardData(stringList.get("tileName39"), stringList.get("tileDesc39"), 0.83f,0.6f,0.58f); //purple

        return tilesGUIData;
    }


}
