package CreationPattern.Prototype;

import java.util.Scanner;

public class Run {
    public Run() {
    }

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Inpute manufacturer of car ");
            String manufacturer = in.nextLine();
            System.out.println("Input description of car");
            String description = in.nextLine();
            System.out.println("Input color of car");
            String color = in.nextLine();
            System.out.println("Input year of car");
            int year = in.nextInt();
            Car car = new Car(manufacturer, description, color, year);
            car.show();
            System.out.println("Let`s clone! Let`s prototype");
            Car copyCar = (Car)car.cloneIt();
            copyCar.show();
        } catch (Exception var8) {
            System.out.println(var8.getMessage());
        }

    }
}
