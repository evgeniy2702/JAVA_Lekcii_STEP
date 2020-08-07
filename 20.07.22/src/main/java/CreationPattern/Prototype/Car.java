package CreationPattern.Prototype;

public class Car extends Device {
    private String manufacturer;
    private String description;
    private String color;
    private int year;

    public Car() {
        this("Nio info", "No description", "No color", 0);
    }

    Car(String manufacturer, String description, String color, int year) {
        this.setName("Car");
        this.setManufacturer(manufacturer);
        this.setDescription(description);
        this.setColor(color);
        this.setYear(year);
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    Device cloneIt() {
        Car car = new Car(this.getManufacturer(), this.getDescription(), this.getColor(), this.getYear());
        return car;
    }

    public void show() {
        super.show();
        System.out.println("Description of car is " + this.getDescription());
        System.out.println("Manufacturer of car is " + this.getManufacturer());
        System.out.println("Color of car is " + this.getColor());
        System.out.println("Year of car is " + this.getYear());
    }
}
