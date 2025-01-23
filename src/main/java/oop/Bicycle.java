package oop;

// Define a class named Bicycle
public class Bicycle {
    //The fields cadence, speed, and gear represent the object's state
    //The methods (changeCadence, changeGear, speedUp etc.) behavior


    // Instance variables (attributes) representing the state of a Bicycle
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    // Method to change the cadence (pedal speed)
    void changeCadence(int newValue) {
        cadence = newValue; // Update cadence to the new value
    }

    // Method to change the gear
    void changeGear(int newValue) {
        gear = newValue; // Update gear to the new value
    }

    // Method to increase the speed
    void speedUp(int increment) {
        speed = speed + increment;  // Increase speed by the given increment
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    // Method to print the current state of the Bicycle
    void printStates() {
        System.out.println("Cadence: " + cadence + ", Speed: " + speed + ", Gear: " + gear);
    }
}
