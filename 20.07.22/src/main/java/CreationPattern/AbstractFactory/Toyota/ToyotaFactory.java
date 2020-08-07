package CreationPattern.AbstractFactory.Toyota;

import CreationPattern.AbstractFactory.CarFactory;
import CreationPattern.AbstractFactory.Engineer;
import CreationPattern.AbstractFactory.Worker;

public class ToyotaFactory implements CarFactory {
    public ToyotaFactory() {
    }

    public Engineer getEngineer() {
        return new ToyotaEngineer();
    }

    public Worker getWorker() {
        return new ToyotaWorker();
    }
}

