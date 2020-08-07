package StructerPattern.Decarator;


public class Run {
    public Run() {
    }

    public static void main(String[] args) {
        City city = new Ukraine(new RegoinCity(new Kiev()));
        System.out.println(city.show());
    }
}
