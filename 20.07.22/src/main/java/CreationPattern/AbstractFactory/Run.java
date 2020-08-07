package CreationPattern.AbstractFactory;


import CreationPattern.AbstractFactory.Toyota.ToyotaFactory;

public class Run {
        public Run() {
        }

        public static void main(String[] args) {
            CarFactory carFactory = new ToyotaFactory();
            Engineer engineer = carFactory.getEngineer();
            Worker worker = carFactory.getWorker();
            engineer.desingCar();
            worker.createCar();
        }
    }

