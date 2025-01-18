package org.example;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        VariablesExample.run();
        PointExample.run();
        strings.run();
        EscapeSequencesExample.run();
        ArithmeticExpressions.run();
        MultiDimensionalArrayExample.run();
        arrays.run();
    }
    public class VariablesExample {
        public static void run() {
            // Integer types
            short shortValue = 32_767;
            int intValue = 2_147_483_647;
            long longValue = 9_223_372_036_854_775_807L;

            //System.out.println("short: " + shortValue);
            //System.out.println("int: " + intValue);
            //System.out.println("long: " + longValue);

            int maxage = 30;
            int age = maxage;
            System.out.println(age);
        }
    }

    public class PointExample {
        public static void run() {
            Point point1 = new Point(1, 1);
            Point point2 = point1;
            point1.x = 2;
            System.out.println("Point2: (" + point2.x + ", " + point2.y + ")");
            System.out.println(point2);
        }
    }

    public class strings {
        public static void run() {
            String message = "   Hello World!!!" + " soukaina  ";
            System.out.println(message);
            System.out.println(message.endsWith("!!"));
            System.out.println(message.startsWith("Hel"));
            System.out.println(message.length());
            System.out.println(message.indexOf("s")); // if char not excite write -1
            System.out.println(message.replace("!", "?")); // target and rep and ? and ! is arguments
            // this method does not modify our original string. it returns a new string
            // in java strings are immutable we cannot mutate them we cannot change them so any methods that modify a string will always return a new string

            System.out.println(message.trim());
        }
    }

    public class EscapeSequencesExample {
        public static void run() {
            System.out.println("Newline example:\nThis is on a new line.");
            System.out.println("Tab example:\tThis text is tabbed.");
            System.out.println("Backspace example: ABC\bD (removes C).");
            System.out.println("Carriage return example: Hello\rWorld (overwrites).");
            System.out.println("Single quote example: It\'s a great day.");
            System.out.println("Double quote example: \"Java is fun!\"");
            System.out.println("Backslash example: A backslash looks like this: \\");
            System.out.println("Form feed example: First page\fSecond page.");
            System.out.println("Unicode example: Greek Omega character: \u03A9");
        }
    }

    public class ArithmeticExpressions {
        public static void run() {
            int a = 10, b = 5;

            // Basic arithmetic operations
            System.out.println("Addition: " + (a + b)); // 15
            System.out.println("Subtraction: " + (a - b)); // 5
            System.out.println("Multiplication: " + (a * b)); // 50
            System.out.println("Division: " + (a / b)); // 2
            System.out.println("Modulus: " + (a % b)); // 0



            int x = 5;
            System.out.println("Post-Increment: " + (x++)); // Prints 5, then x becomes 6
            System.out.println("After Post-Increment: " + x); // 6
            System.out.println("Pre-Increment: " + (++x)); // 7
        }
    }

    public class MultiDimensionalArrayExample {
        public static void run() {
            int [][] nmbr = new int[2][5]; //2 rows and 3 columns
            nmbr [0][0] = 1;
            nmbr [1][1] = 1;
            nmbr [1][2] = 1;
            System.out.println(Arrays.toString(nmbr)); // is problem
            System.out.println(Arrays.deepToString(nmbr));

            int[][] matrix = {
                    {1, 2, 3, 2},
                    {4, 5, 6, 4},
                    {7, 8, 9, 8}
            };
            System.out.println(Arrays.deepToString(matrix));
        }
    }

    public class arrays {
        public static void run() {
            int[] numbers = new int[5];
            numbers[0] = 1;
            numbers[1] = 2;
            System.out.println(numbers); // is problem
            System.out.println(Arrays.toString(numbers));


            int[] num = {1, 5, 3, 4, 2, 8};
            System.out.println(num); // is problem
            System.out.println(num.length);
            // arrays have a fixed length

            Arrays.sort(num);
            System.out.println(Arrays.toString(num));
        }
    }
}
