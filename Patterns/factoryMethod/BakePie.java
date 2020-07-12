package factoryMethod;

    public class BakePie {
        public void bakePie(String type) {
            PieFactory factory = new PieFactory();
            //Фабричный метод решает, экземпляр какого класса вернуть, исходя из входящих параметров
            Pie pie = factory.createPie(type);
            pie.cookFilling();
            pie.sculptDough();
            pie.bake();
            pie.wrapInNapkin();
            System.out.println();
        }

    }
