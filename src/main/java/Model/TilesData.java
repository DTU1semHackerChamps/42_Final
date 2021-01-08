package Model;

public class TilesData {
    private int rentOfground;
    private int oneHouse;
    private int twoHouse;
    private int threeHouse;
    private int fourHouse;
    private int hotel;
    private int propertyPrice;
    private int priceOfHouse;

    public TilesData(int rentOfground, int oneHouse, int twoHouse, int threeHouse, int fourHouse, int hotel, int propertyPrice, int priceOfHouse) {
        this.rentOfground = rentOfground;
        this.oneHouse = oneHouse;
        this.twoHouse = twoHouse;
        this.threeHouse = threeHouse;
        this.fourHouse = fourHouse;
        this.hotel = hotel;
        this.propertyPrice = propertyPrice;
        this.priceOfHouse = priceOfHouse;
    }

    private static TilesData[] tilesData(){
        TilesData [] data = new TilesData[40];
        data[1] = new TilesData(50,250,750,2250 ,4000,6000,1200,1000);
        data[3] = new TilesData(50,250,750,2250 ,4000,6000,1200,1000);
        data[6] = new TilesData(100,600,1800,5400,8000,11000,2000,1000);
        data[8] = new TilesData(100,600,1800,5400,8000,11000,2000,1000);
        data[9] = new TilesData(150,800,2000,6000,9000,12000,2400,1000);
        data[11] = new TilesData(200,1000,3000,9000,1250,15000,2800,2000);
        data[13] = new TilesData(200,1000,3000,9000,1250,15000,2800,2000);
        data[14] = new TilesData(250,1250,3750,10000,14000,18000,3200,2000);
        data[16] = new TilesData(300,1400,4000,11000,15000,19000,3600,2000);
        data[18] = new TilesData(300,1400,4000,11000,15000,19000,3600,2000);
        data[19] = new TilesData(350,1600,4400,12000,16000,20000,4000,2000);
        data[21] = new TilesData(350,1800,5000,14000,17500,21000,4400,3000);
        data[23] = new TilesData(350,1800,5000,14000,17500,21000,4400,3000);
        data[24] = new TilesData(400,2000,6000,15000,18500,22000,4800,3000);
        data[26] = new TilesData(450,2200,6600,16000,19500,23000,5200,3000);
        data[27] = new TilesData(450,2200,6600,16000,19500,23000,5200,3000);
        data[29] = new TilesData(500,2400,7200,17000,20500,24000,5600,3000);
        data[31] = new TilesData(550,2600,7800,18000,22000,25000,6000,4000);
        data[32] = new TilesData(550,2600,7800,18000,22000,25000,6000,4000);
        data[34] = new TilesData(600,3000,9000,20000,24000,28000,6400,4000);
        data[37] = new TilesData(700,3500,10000,22000,26000,30000,7000,4000);
        data[39] = new TilesData(1000,4000,12000,28000,34000,40000,8000,4000);

        return data;
    }

    public int getRentOfground() {
        return rentOfground;
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
