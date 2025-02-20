public class Tea extends CaffeinatedBeverage {
    //Instance Variables
    private int brewTemp;

    public Tea() {
        super("", 0, 0.0);
        brewTemp = 0;
    }
    public Tea(String name, int ounces, double price, int brewTemp) {
        super(name, ounces, price);
        this.brewTemp = brewTemp;
    }
    public Tea(Tea Tea){
        this(Tea.getName(), Tea.getOunces(), Tea.getPrice(), Tea.brewTemp);
    }

    public void setBrewTemp(int brewTemp) {
        this.brewTemp = brewTemp;
    }
    public void setAll(String name, int ounces, double price, int brewTemp) {
        setName(name);
        setOunces(ounces);
        setPrice(price);
        setBrewTemp(brewTemp);
    }
    public int getBrewTemp() {
        return this.brewTemp;
    }
    @Override
    public String toString() {
        return "Tea: " + this.getName() + ", " + this.getOunces() + " ounces, $" + this.getPrice() + ", brewed @ " + this.brewTemp;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        Tea that = (Tea) o;
        return this.getOunces() == that.getOunces() &&
                Double.compare(this.getPrice(), that.getPrice()) == 0 &&
                this.getName().equals(that.getName()) && this.brewTemp == that.brewTemp;
    }

}
