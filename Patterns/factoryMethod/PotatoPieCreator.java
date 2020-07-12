package factoryMethod;

public class PotatoPieCreator extends Creator {
    @Override
    public Pie factoryMethod() {
        return new PotatoPie();
    }
}
