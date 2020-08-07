package StructerPattern.Bridge.Forest;

import StructerPattern.Bridge.Animal;
import StructerPattern.Bridge.BridgeForest;

public class UkrainianBridgeForest extends BridgeForest {

    public UkrainianBridgeForest(Animal animal) {
        super(animal);
    }

    public void animalForest() {
        System.out.println("Ukrainian forest has animals");
        this.animal.walk();
    }
}
