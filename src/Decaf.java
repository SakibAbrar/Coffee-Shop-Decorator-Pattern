public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaffeinated Coffee";
    }

    @Override
    public double cost() {
        return 90;
    }
}
