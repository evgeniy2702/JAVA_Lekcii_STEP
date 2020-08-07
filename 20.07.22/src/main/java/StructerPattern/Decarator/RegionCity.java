package StructerPattern.Decarator;

class RegoinCity extends CityDecorator {

    public RegoinCity(City city) {
        super(city);
    }

    public String showRegion() {
        return "Kievskaya";
    }

    public String show() {
        String str = super.show();
        return str + " " + this.showRegion();
    }
}
