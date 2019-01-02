public abstract class PizzaStore {

    public Pizza orderPizza(String item) {
        Pizza pizza = createPizza(item);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza);
        return pizza;
    }

    public abstract Pizza createPizza(String item);
}
