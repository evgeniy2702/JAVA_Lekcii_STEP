package CreationPattern.FactoryMethod;

public class CompTableFactory implements TableFactory {
    public CompTableFactory() {
    }
@Override
    public Table createTable() {
        return new CompTable();
    }
}
