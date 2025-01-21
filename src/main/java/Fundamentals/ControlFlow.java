package Fundamentals;

public class ControlFlow {
    public static void main(String[] args){
        int x = 12;
        boolean is = x > 20 && x < 30; // in java will evalut from left to right , if the first condition is false
        // , it doesn't matter what we have after the and operator
        boolean is1 = x > 20 || x < 30; //or oprator if at least one condition is true the result will be true
        // in java evalute this from lefto to right, if the first condition is true, it doesn't matter what we have after the and operator
        System.out.println(is);
        System.out.println(is1);


        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (temp > 20) {
            System.out.println("Beautiful day");
        } else {
            System.out.println("Cold day");
        }


        String className = temp > 30 ? "First" : "Scond";
        //condition ? expression1 : expression2;


        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // Switch Without Break (Fall-through)
        int num = 2;

        switch (num) {
            case 1:
                System.out.println("One");
            case 2:
                System.out.println("Two");
            case 3:
                System.out.println("Three");
            default:
                System.out.println("Default case");
        }

    }
}
