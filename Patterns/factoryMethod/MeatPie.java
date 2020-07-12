package factoryMethod;

public class MeatPie extends Pie {
    @Override
    public void cookFilling() {
        super.cookFilling();
        System.out.println("meat");
    }
}
