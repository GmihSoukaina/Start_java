package exceptions;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//public class ExceptionsDemo {
    //public static void show () {sayHello(null);}
    //public static void sayHello (String name){ System.out.println(name.toLowerCase());}
    // we have error NullPointerException becuse that we must handle runtime errors
//}

public class ExceptionsDemo {
    public static void main(String[] args) {
        ExceptionsDemo demo = new ExceptionsDemo();

        // Handling Checked Exception
        demo.checkedExceptionExample();

        // Handling Unchecked Exception
        demo.uncheckedExceptionExample();

        // Demonstrating Error (Commented to avoid crash)
        // demo.errorExample();
    }
    // ✅ Checked Exception (Must be handled at compile-time)
    public void checkedExceptionExample() {
        //  try-catch using in catching exceptions //
        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file); // File might not exist
            System.out.println("File opened successfully.");
        } catch (IOException e) {
            System.out.println("Checked Exception: File not found - " + e.getMessage());
        }
        //Here, IOException is a checked exception, so we must handle it using try-catch.
    }

    // ✅ Unchecked Exception (Runtime exception)
    public void uncheckedExceptionExample() {
        try {
            System.out.println("Inside try block.");
            int num = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: Cannot divide by zero - " + e.getMessage());
        }finally {
        System.out.println("This will always execute.");
        }
    }

    // ✅ Error (System failure, cannot be recovered)
    public void errorExample() {
        recursiveMethod(); // Causes StackOverflowError
    }
    public void recursiveMethod() {
        recursiveMethod(); // Infinite recursion
    }
}

