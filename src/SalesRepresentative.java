/**
 * This is a SalesRepresentative data type class
 */
public class SalesRepresentative {
    private int numberOfSales;
    private double quotaPerSale;
    private String name;

    /**
     * Construct and initializes a SalesRepresentative
     * @param name the name of the sales representative
     * @param numberOfSales the number of sales
     * @param quotaPerSales the quota per sales
     */
    public SalesRepresentative(String name, int numberOfSales, double quotaPerSales){
        this.numberOfSales = numberOfSales;
        this.quotaPerSale = quotaPerSales;
        this.name = name;
    }

    /**
     * This method computes the worth of sales as
     * a product of number of sales and quota per sale
     * @return the worth of sales
     */
    public double wortOfSales () {
        return numberOfSales * quotaPerSale;
    }


    /**
     *  This method override toString method
     * @return a string with a name, number of sales and quota per sale
     */

    @Override
    public String toString() {
        return "Sales " + name +" has " + numberOfSales +" sales with a quota of " + quotaPerSale +"$. He has achieved " + wortOfSales() +"$ worth of sales.";
    }
}
