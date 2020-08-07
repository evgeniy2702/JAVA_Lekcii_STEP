package CreationPattern.FactoryMethod;

public class HomeTable implements Table {
    public HomeTable() {
    }
@Override
    public void info() {
        System.out.println("Home table");
    }
}
