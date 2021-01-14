package Model;

public class BuildableTilePrices {
    private int RentOfGround;
    private int oneHouse;
    private int twoHouse;
    private int threeHouse;
    private int fourHouse;
    private int hotel;
    private int propertyPrice;
    private int priceOfHouse;

    public BuildableTilePrices(int RentOfGround, int oneHouse, int twoHouse, int threeHouse, int fourHouse, int hotel, int propertyPrice, int priceOfHouse) {
        this.RentOfGround = RentOfGround;
        this.oneHouse = oneHouse;
        this.twoHouse = twoHouse;
        this.threeHouse = threeHouse;
        this.fourHouse = fourHouse;
        this.hotel = hotel;
        this.propertyPrice = propertyPrice;
        this.priceOfHouse = priceOfHouse;
    }

    /** data object
     * array over the various prices for the different ownable grounds
     * @return data
     */
    public static BuildableTilePrices[] tilesData(){
        BuildableTilePrices[] data = new BuildableTilePrices[40];
        for(int i = 0; i < 40; i++){
            data[i] = new BuildableTilePrices(0,0,0,0,0,0,0,0);
        }
        data[1] = new BuildableTilePrices(50,250,750,2250 ,4000,6000,1200,1000);
        data[3] = new BuildableTilePrices(50,250,750,2250 ,4000,6000,1200,1000);
        data[6] = new BuildableTilePrices(100,600,1800,5400,8000,11000,2000,1000);
        data[8] = new BuildableTilePrices(100,600,1800,5400,8000,11000,2000,1000);
        data[9] = new BuildableTilePrices(150,800,2000,6000,9000,12000,2400,1000);
        data[11] = new BuildableTilePrices(200,1000,3000,9000,1250,15000,2800,2000);
        data[13] = new BuildableTilePrices(200,1000,3000,9000,1250,15000,2800,2000);
        data[14] = new BuildableTilePrices(250,1250,3750,10000,14000,18000,3200,2000);
        data[16] = new BuildableTilePrices(300,1400,4000,11000,15000,19000,3600,2000);
        data[18] = new BuildableTilePrices(300,1400,4000,11000,15000,19000,3600,2000);
        data[19] = new BuildableTilePrices(350,1600,4400,12000,16000,20000,4000,2000);
        data[21] = new BuildableTilePrices(350,1800,5000,14000,17500,21000,4400,3000);
        data[23] = new BuildableTilePrices(350,1800,5000,14000,17500,21000,4400,3000);
        data[24] = new BuildableTilePrices(400,2000,6000,15000,18500,22000,4800,3000);
        data[26] = new BuildableTilePrices(450,2200,6600,16000,19500,23000,5200,3000);
        data[27] = new BuildableTilePrices(450,2200,6600,16000,19500,23000,5200,3000);
        data[29] = new BuildableTilePrices(500,2400,7200,17000,20500,24000,5600,3000);
        data[31] = new BuildableTilePrices(550,2600,7800,18000,22000,25000,6000,4000);
        data[32] = new BuildableTilePrices(550,2600,7800,18000,22000,25000,6000,4000);
        data[34] = new BuildableTilePrices(600,3000,9000,20000,24000,28000,6400,4000);
        data[37] = new BuildableTilePrices(700,3500,10000,22000,26000,30000,7000,4000);
        data[39] = new BuildableTilePrices(1000,4000,12000,28000,34000,40000,8000,4000);

        return data;
    }

    /** data object
     * array of the different price stages
     * @param position
     * @param tilesData
     * @return
     */
    public static int[] rentPrice(int position, BuildableTilePrices[] tilesData){
        int[] rentStage = new int[6];
        rentStage[0] = tilesData[position].getRentOfGround();
        rentStage[1] = tilesData[position].getOneHouse();
        rentStage[2] = tilesData[position].getTwoHouse();
        rentStage[3] = tilesData[position].getThreeHouse();
        rentStage[4] = tilesData[position].getFourHouse();
        rentStage[5] = tilesData[position].getHotel();

        return rentStage;
    }

    public int getRentOfGround() {
        return RentOfGround;
    }

    public int getOneHouse() {
        return oneHouse;
    }

    public int getTwoHouse() {
        return twoHouse;
    }

    public int getThreeHouse() {
        return threeHouse;
    }

    public int getFourHouse() {
        return fourHouse;
    }

    public int getHotel() {
        return hotel;
    }

    public int getPropertyPrice() {
        return propertyPrice;
    }

    public int getPriceOfHouse() {
        return priceOfHouse;
    }
}
