package simpleFactory;

public class ApplePie extends Pie {
    @Override
    public void cookFilling() {
        super.cookFilling();
        System.out.println("apple");
    }
}
