package StructerPattern.Bridge.Forest;

import StructerPattern.Bridge.Animal;
import StructerPattern.Bridge.BridgeForest;

public class CanadianBridgeForest extends BridgeForest {

    public CanadianBridgeForest(Animal animal) {
        super(animal);
    }

    public void animalForest() {
        System.out.println("Canadian forest has animals");
        this.animal.walk();
    }
}