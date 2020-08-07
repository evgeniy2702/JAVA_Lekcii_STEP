package StructerPattern.Decarator;

class CityDecorator implements City {

    City city;

    public CityDecorator(City city) {
        this.city = city;
    }

    @Override
    public String show() {
        return this.city.show();
    }
}

