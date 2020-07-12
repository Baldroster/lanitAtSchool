package factoryMethod;

public class ApplePieCreator extends  Creator {

    //Фабричный метод может иметь более сложную внутреннюю струтуру, нежели простой вызов конструктора. Например здесь могла бы распологатся Простая Фабрика
    @Override
    public Pie factoryMethod() {
        return new ApplePie();
    }
}
