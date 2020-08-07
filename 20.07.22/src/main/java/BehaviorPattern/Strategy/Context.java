package BehaviorPattern.Strategy;

public class Context {

    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b){
        return strategy.execute(a,b);
    }
}
