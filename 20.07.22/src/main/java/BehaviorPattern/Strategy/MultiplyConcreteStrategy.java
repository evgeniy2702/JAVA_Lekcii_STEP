package BehaviorPattern.Strategy;

public class MultiplyConcreteStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
