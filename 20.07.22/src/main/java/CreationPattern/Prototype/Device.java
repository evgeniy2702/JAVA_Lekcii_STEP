package CreationPattern.Prototype;

abstract class Device {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Device(String dname) {
        this.setName(dname);
    }

    public Device() {
        this.setName("Unknowne Device");
    }

    abstract Device cloneIt();

    public void show() {
        System.out.println("name = " + this.name);
    }
}