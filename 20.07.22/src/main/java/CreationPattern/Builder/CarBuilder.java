package CreationPattern.Builder;

public class CarBuilder {
    String name;
    int maxSpeed;
    String type;

    public CarBuilder() {
    }

    CarBuilder name(String name) {
        this.name = name;
        return this;
    }

    CarBuilder maxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    CarBuilder type(String type) {
        this.type = type;
        return this;
    }

    public Car createCar() {
        Car car = new Car();
        car.setName(this.name);
        car.setMaxSpeed(this.maxSpeed);
        car.setType(this.type);
        return car;
    }
}

