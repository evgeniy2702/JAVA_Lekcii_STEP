package CreationPattern.Builder;

public class Car {
    String name;
    int maxSpeed;
    String type;

    public Car() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "Car{name='" + this.name + "', maxSpeed=" + this.maxSpeed + ", type='" + this.type + "'}";
    }
}
