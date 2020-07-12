package strategy;

// Класс контекста использующий интерфейс стратегии
class Context {

    private Strategy strategy;


    public Context() {
    }

    // Выберем новую стратегию
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    //Выполним текущую стратегию
    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
