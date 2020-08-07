package StructerPattern.Composites;

public class RadRectangle extends Rectangle {

    public String name;

    public RadRectangle() {
        name = info();
    }

    public String info(){
        return "RadRectangle";
    }
}