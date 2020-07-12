package factoryMethod;

abstract class Creator {
    //Тот самый фабричный метод, с помощью которого создание конкретных объектов делегируется наследникам
    public abstract Pie factoryMethod();
}
