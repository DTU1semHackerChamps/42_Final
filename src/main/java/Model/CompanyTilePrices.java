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

    private static CompanyTilePrices[] companyData(){
        CompanyTilePrices[] data = new CompanyTilePrices[2];
        data[0] = new CompanyTilePrices(500, 1000, 2000, 4000, 4000);
        data[1] = new CompanyTilePrices(0, 0, 0, 0, 3000);

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
