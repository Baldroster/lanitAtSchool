package simpleFactory;

public class MakeSomePie {
    public static void main(String[] args) {
        BakePie bakePie = new BakePie();
        bakePie.bakePie("Мясной");
        bakePie.bakePie("Картофельный");
        bakePie.bakePie("Яблочный");
        bakePie.bakePie("Грибной");
    }
}
