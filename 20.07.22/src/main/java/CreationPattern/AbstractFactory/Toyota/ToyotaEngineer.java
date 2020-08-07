package CreationPattern.AbstractFactory.Toyota;

import CreationPattern.AbstractFactory.Engineer;

public class ToyotaEngineer implements Engineer {
    public ToyotaEngineer() {
    }

    public void desingCar() {
        System.out.println("Desing Car");
    }
}
