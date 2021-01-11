package Model;

public class CompanyTilePrices {
    private int rentOneShipping;
    private int rentTwoShipping;
    private int rentThreeShipping;
    private int rentFourShipping;
    private int priceOfCompany;

    public CompanyTilePrices(int rentOneShipping, int rentTwoShipping, int rentThreeShipping, int rentFourShipping, int priceOfCompany) {
        this.rentOneShipping = rentOneShipping;
        this.rentTwoShipping = rentTwoShipping;
        this.rentThreeShipping = rentThreeShipping;
        this.rentFourShipping = rentFourShipping;
        this.priceOfCompany = priceOfCompany;
    }

    /**
     * array with price data for shipping companies (data 5, 15, 25, 35), and breweries (data 12, 28)
     * @return data
     */
    public static CompanyTilePrices[] companyData(){
        CompanyTilePrices[] data = new CompanyTilePrices[40];
        for(int i = 0; i < 40; i++){
            data[i] = new CompanyTilePrices(0,0,0,0,0);
        }
        data[5] = new CompanyTilePrices(500, 1000, 2000, 4000, 4000);
        data[15] = new CompanyTilePrices(500, 1000, 2000, 4000, 4000);
        data[25] = new CompanyTilePrices(500, 1000, 2000, 4000, 4000);
        data[35] = new CompanyTilePrices(500, 1000, 2000, 4000, 4000);
        data[12] = new CompanyTilePrices(0, 0, 0, 0, 3000);
        data[28] = new CompanyTilePrices(0, 0, 0, 0, 3000);
        return data;
    }

    public static int[] shippingPrice(int position, CompanyTilePrices[] companyData){
        int[] rentStage = new int[4];
        rentStage[0] = companyData[position].getRentOneShipping();
        rentStage[1] = companyData[position].getRentTwoShipping();
        rentStage[2] = companyData[position].getRentThreeShipping();
        rentStage[3] = companyData[position].getRentFourShipping();

        return rentStage;
    }

    public int getRentOneShipping() {
        return rentOneShipping;
    }

    public int getRentTwoShipping() {
        return rentTwoShipping;
    }

    public int getRentThreeShipping() {
        return rentThreeShipping;
    }

    public int getRentFourShipping() {
        return rentFourShipping;
    }

    public int getPriceOfCompany() {
        return priceOfCompany;
    }
}
