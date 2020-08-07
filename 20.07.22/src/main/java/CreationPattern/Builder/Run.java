package CreationPattern.Builder;

public class Run {
    public Run() {
    }

    public static void main(String[] args) {
        Car car = (new CarBuilder()).name("Tesla").maxSpeed(200).type("sedan").createCar();
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.name("Toyota");
        carBuilder.maxSpeed(180);
        carBuilder.type("minivan");
        Car car1 = carBuilder.createCar();
        System.out.println(car.toString());
        System.out.println(car1.toString());
    }
}