package strategy;

// Пример использования
class StrategyExample {

    public static void main(String[] args) {

        Context context = new Context();
        //Установим стратегию сложения
        context.setStrategy(new ConcreteStrategyAdd());
        //Выполним вычисления
        int resultA = context.executeStrategy(3,4);

        //Установим стратегию вычитания и выполним вычисления
        context.setStrategy(new ConcreteStrategySubtract());
        int resultB = context.executeStrategy(3,4);

        //Установим стратегию умножения и выполним вычисления
        context.setStrategy(new ConcreteStrategyMultiply());
        int resultC = context.executeStrategy(3,4);

        System.out.println("Result A : " + resultA );
        System.out.println("Result B : " + resultB );
        System.out.println("Result C : " + resultC );
    }
}
