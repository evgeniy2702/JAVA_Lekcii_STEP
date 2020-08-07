package CreationPattern.AbstractFactory.Toyota;

import CreationPattern.AbstractFactory.Worker;

public class ToyotaWorker implements Worker {
    public ToyotaWorker() {
    }

    public void createCar() {
        System.out.println("Create Car");
    }
}

