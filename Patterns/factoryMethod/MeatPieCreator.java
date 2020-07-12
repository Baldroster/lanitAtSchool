package factoryMethod;

public class MeatPieCreator extends Creator {
    @Override
    //Фабричный метод может иметь более сложную внутреннюю струтуру, нежели простой вызов конструктора. Например здесь могла бы распологатся Простая Фабрика
    public Pie factoryMethod() {
        return new MeatPie();
    }
}
