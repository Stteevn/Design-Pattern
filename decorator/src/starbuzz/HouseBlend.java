package starbuzz;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "house blend";
    }

    @Override
    public double cost() {
        return 1.15;
    }
}
