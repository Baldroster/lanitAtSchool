package simpleFactory;

    public class BakePie {
        public void bakePie(String type) {
            PieFactory factory = new PieFactory();
            //Инкапсулируем логику создания объекта. Определяем экземпляр какого класса вернуть, исходя из входящих параметров
            Pie pie = factory.createPie(type);
            pie.cookFilling();
            pie.sculptDough();
            pie.bake();
            pie.wrapInNapkin();
            System.out.println();
        }

    }
