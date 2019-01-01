package starbuzz;

public class StarBuzz {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
