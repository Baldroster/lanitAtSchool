package factoryMethod;

public class Example {
    public static void main(String[] args) {
        Creator[] creators = {new ApplePieCreator(), new MeatPieCreator(), new PotatoPieCreator()};
        for (Creator creator: creators) {
            Pie pie = creator.factoryMethod();
            System.out.println("Создан {" + pie.getClass()+"}");
        }
    }
}
