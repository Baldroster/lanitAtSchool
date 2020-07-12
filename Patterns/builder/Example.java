package builder;

public class Example {
    public static void main(String[] args) {
        Director director = new Director();

        //Инициализируем необходимого нам строителя
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();

        //Передаем директору подходящего строителя
        director.setPizzaBuilder(hawaiianPizzaBuilder);
        director.constructPizza();

        Pizza pizza = director.getPizza();
    }
}
