package StructerPattern.Decarator;

public class Ukraine extends CityDecorator {

    public Ukraine(City city) {
        super(city);
    }

    public String country() {
        return "Ukraine";
    }

    public String show() {
        String str = super.show();
        return str + " " + this.country();
    }
}
