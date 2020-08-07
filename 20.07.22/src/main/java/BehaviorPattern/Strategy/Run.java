package BehaviorPattern.Strategy;

public class Run {

    public static void main(String[] args) {

        int a = 5;
        int b = 6;

        Context context = new Context();

        context.setStrategy(new AddConcreteStrategy());
        System.out.println("Context = " + context.executeStrategy(a,b));

        context.setStrategy(new SubtractConcreteStrategy());
        System.out.println("Context = " + context.executeStrategy(a,b));

        context.setStrategy(new MultiplyConcreteStrategy());
        System.out.println("Context = " + context.executeStrategy(a,b));
    }
}
