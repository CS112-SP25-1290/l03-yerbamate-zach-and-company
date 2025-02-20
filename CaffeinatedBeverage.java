public class CaffeinatedBeverage
{
    private String name;
    private int ounces;
    private double price;

    public CaffeinatedBeverage(String name, int ounces, double price) {
        this.name = name;
        this.ounces = ounces;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOunces() {
        return this.ounces;
    }

    public void setOunces(int ounces) {
        this.ounces = ounces;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        CaffeinatedBeverage that = (CaffeinatedBeverage) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
                this.name.equals(that.name);
    }
    
}