public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }else {
            return new NYStyleClamPizza();
        }
    }
}
