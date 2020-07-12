package builder;

public class Example {
    public static void main(String[] args) {
        Director director = new Director();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        director.setPizzaBuilder(hawaiianPizzaBuilder);
        director.constructPizza();

        Pizza pizza = director.getPizza();
    }
}
