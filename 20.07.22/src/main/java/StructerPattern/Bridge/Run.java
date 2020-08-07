package StructerPattern.Bridge;

import StructerPattern.Bridge.Animals.Fox;
import StructerPattern.Bridge.Animals.Wolf;
import StructerPattern.Bridge.Forest.CanadianBridgeForest;
import StructerPattern.Bridge.Forest.UkrainianBridgeForest;

public class Run {
    public Run() {
    }

    public static void main(String[] args) {
        BridgeForest ukr = new UkrainianBridgeForest(new Fox());
        BridgeForest can = new CanadianBridgeForest(new Wolf());
        ukr.animalForest();
        can.animalForest();
    }
}