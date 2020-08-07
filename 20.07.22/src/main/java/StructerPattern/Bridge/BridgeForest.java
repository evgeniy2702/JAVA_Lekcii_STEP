package StructerPattern.Bridge;

public abstract class BridgeForest {

    public Animal animal;

    public BridgeForest(Animal animal) {
        this.animal = animal;
    }

    public abstract void animalForest();


}
