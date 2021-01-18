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

    /** data object
     * array with price data for shipping companies (data 5, 15, 25, 35), and breweries (data 12, 28)
     * @return data
     */
    public static CompanyTilePrices[] companyData(){
        CompanyTilePrices[] companyData = new CompanyTilePrices[40];
        for(int i = 0; i < 40; i++){
            companyData[i] = new CompanyTilePrices(0,0,0,0,0);
        }
        companyData[5] = new CompanyTilePrices(500, 1000, 2000, 4000, 4000);
        companyData[15] = new CompanyTilePrices(500, 1000, 2000, 4000, 4000);
        companyData[25] = new CompanyTilePrices(500, 1000, 2000, 4000, 4000);
        companyData[35] = new CompanyTilePrices(500, 1000, 2000, 4000, 4000);
        // Brewery tiles
        companyData[12] = new CompanyTilePrices(0, 0, 0, 0, 3000);
        companyData[28] = new CompanyTilePrices(0, 0, 0, 0, 3000);
        return companyData;
    }

    /** data object
     * array of the price stages. Could be used somewhere
     * @param position
     * @param companyData
     * @return
     */
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
