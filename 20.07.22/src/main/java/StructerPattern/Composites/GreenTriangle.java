package StructerPattern.Composites;

public class GreenTriangle extends Triangle {

    public String name;

    public GreenTriangle() {
        name = info();
    }

    public String info(){
        return "GreenTriangle";
    }
}
