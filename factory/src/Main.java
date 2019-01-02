public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza1 = pizzaStore.orderPizza("cheese");
        Pizza pizza2 = pizzaStore.orderPizza("clam");
    }
}
