package Model;

import java.util.HashMap;

public class GUIBoardData {

    private String streetName;
    private String tileDescription;
    private float hue, sat, bright;

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
    public static GUIBoardData [] tilesData(HashMap<String, String> stringList){
        GUIBoardData[] tilesData = new GUIBoardData[40];


        tilesData[0] = new GUIBoardData(stringList.get("tileName0"), stringList.get("tileDesc0"), 0.0f,1.0f,0.59f); //start red
        tilesData[1] = new GUIBoardData(stringList.get("tileName1"), stringList.get("tileDesc1"), 0.196f,1f,0.36f); //blue
        tilesData[2] = new GUIBoardData(stringList.get("tileName2"), stringList.get("tileDesc2"), 0.00f,0f,0.15f); //chanceCard
        tilesData[3] = new GUIBoardData(stringList.get("tileName3"), stringList.get("tileDesc3"), 0.57f,1f,0.36f); //blue
        tilesData[4] = new GUIBoardData(stringList.get("tileName4"), stringList.get("tileDesc4"), 0.00f,0f,0.88f); //neutralTiles
        tilesData[5] = new GUIBoardData(stringList.get("tileName5"), stringList.get("tileDesc5"), 0.57f,0.97f,0.38f); //blueFerry
        tilesData[6] = new GUIBoardData(stringList.get("tileName6"), stringList.get("tileDesc6"), 0.04f,0.84f,0.65f); //orange
        tilesData[7] = new GUIBoardData(stringList.get("tileName7"), stringList.get("tileDesc7"), 0.00f,0f,0.15f); //chanceCard
        tilesData[8] = new GUIBoardData(stringList.get("tileName8"), stringList.get("tileDesc8"), 0.04f,0.84f,0.65f); //orange
        tilesData[9] = new GUIBoardData(stringList.get("tileName9"), stringList.get("tileDesc9"), 0.04f,0.84f,0.65f); //orange
        tilesData[10] = new GUIBoardData(stringList.get("tileName10"), stringList.get("tileDesc10"), 0.00f,0f,0.15f); //jail
        tilesData[11] = new GUIBoardData(stringList.get("tileName11"), stringList.get("tileDesc11"), 0.13f,0.98f,0.55f); //green
        tilesData[12] = new GUIBoardData(stringList.get("tileName12"), stringList.get("tileDesc12"), 0.01f,0.81f,0.58f); //brewery
        tilesData[13] = new GUIBoardData(stringList.get("tileName13"), stringList.get("tileDesc13"), 0.13f,0.98f,0.55f); //green
        tilesData[14] = new GUIBoardData(stringList.get("tileName14"), stringList.get("tileDesc14"), 0.13f,0.98f,0.55f); //green
        tilesData[15] = new GUIBoardData(stringList.get("tileName15"), stringList.get("tileDesc15"), 0.57f,0.97f,0.38f); //blueFerry
        tilesData[16] = new GUIBoardData(stringList.get("tileName16"), stringList.get("tileDesc16"), 0.17f,0.11f,0.4f); //grey
        tilesData[17] = new GUIBoardData(stringList.get("tileName17"), stringList.get("tileDesc17"), 0.00f,0f,0.15f); //chanceCard
        tilesData[18] = new GUIBoardData(stringList.get("tileName18"), stringList.get("tileDesc18"), 0.17f,0.11f,0.4f); //grey
        tilesData[19] = new GUIBoardData(stringList.get("tileName19"), stringList.get("tileDesc19"), 0.17f,0.11f,0.4f); //grey
        tilesData[20] = new GUIBoardData(stringList.get("tileName20"), stringList.get("tileDesc20"), 0.00f,0f,0.88f); //neutralTiles
        tilesData[21] = new GUIBoardData(stringList.get("tileName21"), stringList.get("tileDesc21"), 0.01f,0.75f,0.62f); //red
        tilesData[22] = new GUIBoardData(stringList.get("tileName22"), stringList.get("tileDesc22"), 0.00f,0f,0.15f); //chanceCard
        tilesData[23] = new GUIBoardData(stringList.get("tileName23"), stringList.get("tileDesc23"), 0.01f,0.75f,0.62f); //red
        tilesData[24] = new GUIBoardData(stringList.get("tileName24"), stringList.get("tileDesc24"), 0.01f,0.75f,0.62f); //red
        tilesData[25] = new GUIBoardData(stringList.get("tileName25"), stringList.get("tileDesc25"), 0.57f,0.97f,0.38f); //blueFerry
        tilesData[26] = new GUIBoardData(stringList.get("tileName26"), stringList.get("tileDesc26"), 0.08f,0.19f,0.69f); //white
        tilesData[27] = new GUIBoardData(stringList.get("tileName27"), stringList.get("tileDesc27"), 0.08f,0.19f,0.69f); //white
        tilesData[28] = new GUIBoardData(stringList.get("tileName28"), stringList.get("tileDesc28"), 0.01f,0.81f,0.58f); //brewery
        tilesData[29] = new GUIBoardData(stringList.get("tileName29"), stringList.get("tileDesc29"), 0.08f,0.19f,0.69f); //white
        tilesData[30] = new GUIBoardData(stringList.get("tileName30"), stringList.get("tileDesc30"), 0.00f,0f,0.15f); //jail
        tilesData[31] = new GUIBoardData(stringList.get("tileName31"), stringList.get("tileDesc31"), 0.12f,0.95f,0.67f); //yellow
        tilesData[32] = new GUIBoardData(stringList.get("tileName32"), stringList.get("tileDesc32"), 0.12f,0.95f,0.67f); //yellow
        tilesData[33] = new GUIBoardData(stringList.get("tileName33"), stringList.get("tileDesc33"), 0.00f,0f,0.15f); //chanceCard
        tilesData[34] = new GUIBoardData(stringList.get("tileName34"), stringList.get("tileDesc34"), 0.12f,0.95f,0.67f); //yellow
        tilesData[35] = new GUIBoardData(stringList.get("tileName35"), stringList.get("tileDesc35"), 0.57f,0.97f,0.38f); //blueFerry
        tilesData[36] = new GUIBoardData(stringList.get("tileName36"), stringList.get("tileDesc36"), 0.00f,0f,0.15f); //chanceCard
        tilesData[37] = new GUIBoardData(stringList.get("tileName37"), stringList.get("tileDesc37"), 0.78f,0.65f,0.24f); //purple
        tilesData[38] = new GUIBoardData(stringList.get("tileName38"), stringList.get("tileDesc38"), 0.00f,0f,0.88f); //neutralTiles
        tilesData[39] = new GUIBoardData(stringList.get("tileName39"), stringList.get("tileDesc39"), 0.78f,0.65f,0.24f); //purple

        return tilesData;
    }


}
