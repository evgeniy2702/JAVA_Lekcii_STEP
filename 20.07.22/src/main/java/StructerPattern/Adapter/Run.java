package StructerPattern.Adapter;

public class Run {
    public Run() {
    }

    public static void main(String[] args) {
        Table table = new AdapterTable();
        table.material();
        table.amountLags();
        table.color();
    }
}
