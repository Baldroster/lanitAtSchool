package simpleFactory;

public class PotatoPie extends Pie {
    @Override
    public void cookFilling() {
        super.cookFilling();
        System.out.println("potato");
    }
}
