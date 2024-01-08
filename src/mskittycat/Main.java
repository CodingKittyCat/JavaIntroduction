package mskittycat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // INPUT AND OUTPUT - 4
        // Print
//        System.out.println("penis");
//
//        // Variable
//        int life = 18;
//
//        // Print Variable
//        System.out.println(life);
//
//        // Print line + variable
//        int grade = 80;
//        System.out.println("your grade is " + grade);
//
//        // Input
//        Scanner scanner = new Scanner(System.in);
//
//        // Int input
//        int number = scanner.nextInt();
//        System.out.println("You just typed " + number);
//
//        // String input
//        scanner.nextLine();
//        String input = scanner.nextLine();
//        System.out.println("You now just typed (String): " + input);


        // MATHS AND INTEGERS - 5
        int a = 100;
        int b = 200;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Subtraction
        int sub = a - b;
        System.out.println("Subtraction: " + sub);

        // Multiplication
        int multi = a * b;
        System.out.println("Multiplication: " + multi);

        // Division
        int division = a / b;
        System.out.println("Division: " + division);

        division = b / a;
        System.out.println("Division: " + division);

        // Remainder (Modulo)
        int remainder = 101 % 2;
        System.out.println("Remaining from 100 / 2: " + remainder);

        remainder = 100 % 3;
        System.out.println("Remaining from 100 / 3: " + remainder);

        remainder = 100 % 4;
        System.out.println("Remaining from 100 / 4: " + remainder);

        // Some Math Mods
        System.out.println("Absolute: " + Math.abs(-100));

        System.out.println("Ceiling: " + Math.ceil(1.23)); // Rounding up
        System.out.println("Round: " + Math.round(1.23)); // Rounding
        System.out.println("Floor: " + Math.floor(1.23)); // Rounding Down

        System.out.println("Minimum: " + Math.min(10, 200));
        System.out.println("Minimum: " + Math.max(37, 750));

    }
}
