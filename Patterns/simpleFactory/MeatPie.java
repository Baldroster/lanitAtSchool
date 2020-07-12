package simpleFactory;

public class MeatPie extends Pie {
    @Override
    public void cookFilling() {
        super.cookFilling();
        System.out.println("meat");
    }
}
