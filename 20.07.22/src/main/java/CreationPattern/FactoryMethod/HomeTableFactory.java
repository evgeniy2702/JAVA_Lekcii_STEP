package CreationPattern.FactoryMethod;

public class HomeTableFactory implements TableFactory {
    public HomeTableFactory() {
    }
@Override
    public Table createTable() {
        return new HomeTable();
    }
}