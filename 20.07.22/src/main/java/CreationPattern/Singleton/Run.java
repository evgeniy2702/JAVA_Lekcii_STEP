package CreationPattern.Singleton;

public class Run {
    public Run() {
    }

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        logger1.setData("Data 1");
        System.out.println("logger1 = " + logger1.getData());
        logger2.setData("Data 2");
        System.out.println("logger2 = " + logger2.getData());
        System.out.println("logger1 = " + logger1.getData());
    }
}
