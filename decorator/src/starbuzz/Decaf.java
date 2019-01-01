package starbuzz;

public class Decaf extends Beverage {

    public Decaf() {
        description = "decaf";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
