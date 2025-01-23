package oop;

// Main class where program execution starts
public class Main {
    // The main method is the entry point of the Java program
    public static void main(String[] args) {
        // Creating objects of the Bicycle class (instances of Bicycle)
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Modifying the state of bike1 (first bicycle)
        bike1.changeCadence(50);
        bike1.changeGear(2);
        bike1.speedUp(10);
        bike1.applyBrakes(2);

        bike1.cadence = 15;
        System.out.println(bike1.cadence);

        // Modifying the state of bike2 (second bicycle)
        bike2.changeCadence(40);
        bike2.changeGear(3);
        bike2.speedUp(15);
        bike2.applyBrakes(5);

        System.out.println(bike2.cadence);

        // Printing the state of both bikes
        System.out.print("Bike 1: ");
        bike1.printStates(); // Output: Bike 1 state (cadence, speed, gear)

        System.out.print("Bike 2: ");
        bike2.printStates(); // Output: Bike 2 state (cadence, speed, gear)
    }
}
