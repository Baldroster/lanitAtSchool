package simpleFactory;

public class PieFactory {
    public Pie createPie(String type) {
        Pie pie;

        //Фабричный метод решает, экземпляр какого класса вернуть, исходя из входящих параметров
        switch (type) {
            case "Мясной":
                pie = new MeatPie();
                break;
            case "Яблочный":
                pie = new ApplePie();
                break;
            case "Картофельный":
                pie = new PotatoPie();
                break;
            default:
                throw new NoSuchPieExeption(type);
        }

        return pie;
    }
}
