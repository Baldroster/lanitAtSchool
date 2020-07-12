package factoryMethod;

public class MeatPieCreator extends Creator {
    @Override
    public Pie factoryMethod() {
        return new MeatPie();
    }
}
