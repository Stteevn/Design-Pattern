public class NYStyleClamPizza extends Pizza{
    public NYStyleClamPizza() {
        name = "NY clam pizza";
        sauce = "little sauce";
        dough = "thin dough";
    }

    @Override
    public void cut() {
        System.out.println("Cut the pizza into triangle slices");
    }
}
