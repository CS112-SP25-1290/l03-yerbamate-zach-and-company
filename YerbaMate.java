public class YerbaMate extends Tea {
    private int numPasses;

    public YerbaMate() {
        super(" ", 0, 0.0, 0);
        this.numPasses = 0;
    }

    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses) {
        super(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }

    public YerbaMate(YerbaMate YerbaMate) {
        this(YerbaMate.getName(), YerbaMate.getOunces(), YerbaMate.getPrice(),
            YerbaMate.getBrewTemp(), YerbaMate.numPasses);
    }

    public int getNumPasses() {
        return this.numPasses;
    }

    public String passMate() {
        numPasses++;
        return "The Mate has been passed! Total pass count: " + getNumPasses();
    }

    public void refill(int ounces) {
        setOunces(this.getOunces() + ounces);
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || this.getClass() != o.getClass())
            return false;
        YerbaMate that = (YerbaMate) o;
        return this.getOunces() == that.getOunces() &&
                Double.compare(this.getPrice(), that.getPrice()) == 0 &&
                this.getName().equals(that.getName()) && this.getBrewTemp() == that.getBrewTemp()
                && this.numPasses == that.numPasses;
    }

    @Override
    public String toString() {
        return "Yerba Mate: " + this.getName() + ", " + this.getOunces() + ", " + getBrewTemp() + ", $" + getPrice() + ", " + getNumPasses() + " passes so far."; 

    }


}
