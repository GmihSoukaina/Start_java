package exceptions;

public class ExceptionsDemo {
    public static void show () {
        sayHello(null);
    }

    public static void sayHello (String name){
        System.out.println(name.toLowerCase());
    }

    // we have error NullPointerException becuse that we must handle runtime errors
}
