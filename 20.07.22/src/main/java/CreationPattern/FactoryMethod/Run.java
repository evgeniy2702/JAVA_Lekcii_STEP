package CreationPattern.FactoryMethod;

public class Run {
    public Run() {
    }

    public static void main(String[] args) {
        TableFactory tableFactory = new HomeTableFactory();
        Table table = tableFactory.createTable();
        table.info();
        TableFactory tableFactory1 = configure("PC");
        Table table1 = tableFactory1.createTable();
        table1.info();
        tableFactory = configure("PC");
        table = tableFactory.createTable();
        table.info();
    }

    static TableFactory configure(String type) {
        if (type.equals("PC")) {
            return new CompTableFactory();
        } else if (type.equals("HOME")) {
            return new HomeTableFactory();
        } else {
            System.out.println("This table is not create");
            return null;
        }
    }
}

