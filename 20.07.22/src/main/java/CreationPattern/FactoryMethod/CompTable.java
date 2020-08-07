package CreationPattern.FactoryMethod;

public class CompTable implements Table {
    public CompTable() {
    }
    @Override
    public void info() {
        System.out.println("PC table");
    }
}