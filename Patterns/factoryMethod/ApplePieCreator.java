package factoryMethod;

public class ApplePieCreator extends  Creator {

    //Фабричный метод может иметь более сложную внутреннюю струтуру
    @Override
    public Pie factoryMethod() {
        return new ApplePie();
    }
}
