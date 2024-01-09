package mskittycat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        // INPUT AND OUTPUT - 4
//        // Print
//        System.out.println("testing");
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


//        // MATHS AND INTEGERS - 5
//        int a = 100;
//        int b = 200;
//
//        // Addition
//        int sum = a + b;
//        System.out.println("Sum: " + sum);
//
//        // Subtraction
//        int sub = a - b;
//        System.out.println("Subtraction: " + sub);
//
//        // Multiplication
//        int multi = a * b;
//        System.out.println("Multiplication: " + multi);
//
//        // Division
//        int division = a / b;
//        System.out.println("Division: " + division);
//
//        division = b / a;
//        System.out.println("Division: " + division);
//
//        // Remainder (Modulo)
//        int remainder = 101 % 2;
//        System.out.println("Remaining from 100 / 2: " + remainder);
//
//        remainder = 100 % 3;
//        System.out.println("Remaining from 100 / 3: " + remainder);
//
//        remainder = 100 % 4;
//        System.out.println("Remaining from 100 / 4: " + remainder);
//
//        // Some Math Mods
//        System.out.println("Absolute: " + Math.abs(-100));
//
//        System.out.println("Ceiling: " + Math.ceil(1.23)); // Rounding up
//        System.out.println("Round: " + Math.round(1.23)); // Rounding
//        System.out.println("Floor: " + Math.floor(1.23)); // Rounding Down
//
//        System.out.println("Minimum: " + Math.min(10, 200));
//        System.out.println("Minimum: " + Math.max(37, 750));

//        // BOOLEANS - 6
//        boolean goodVideo = false;
//        boolean subscribed = false;
//        System.out.println("This is a good video: " + goodVideo);
//
//        boolean isCreative = false;
//        System.out.println("Player is in Creative Mode: " + isCreative);
//
//        // COMPARISONS (< <= >= > == !=)
//        int points = 40;
//        int pointsToPass = 55;
//        boolean hasPassedTest = points >= pointsToPass; // Bigger or Equals
//        System.out.println("Has passed the Test " + hasPassedTest);
//
//        int health = 0;
//        boolean isAlive = health > 0;
//        System.out.println("Is Player penis still alive? " + isAlive);
//
//        // LOGIC (AND / OR / NOT)
//        boolean passedTest1 = true;
//        boolean passedTest2 = true;
//        boolean hasHonors = passedTest2 && passedTest1; // TRUE if both are true
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Age:");
//        int age = scanner.nextInt();
//        System.out.println("Put in true or false");
//        boolean isEuropean = scanner.nextBoolean();
//
//        int euDrinkingAge = 18;
//        int usDrinkingAge = 21;
//
//        boolean canDrink = (isEuropean && age >= euDrinkingAge) || (!isEuropean && age >= usDrinkingAge);
//        System.out.println("Can you drink? " + canDrink);

//        // ASSIGNMENT OPERATORS - 7
//        int mana = 100;
//        System.out.println("Mana: " + mana);
//
//        // ADDITION +=
//        mana += 20;
//        System.out.println("Mana: " + mana);
//
//        // ADDITION ++
//        mana++;
//        System.out.println("Mana: " + mana);
//
//        // SUBTRACTION -=
//        mana -= 60;
//        System.out.println("Mana: " + mana);
//
//        // SUBTRACTION --
//        mana--;
//        System.out.println("Mana: " + mana);
//
//        // MULTIPLY *=
//        mana *= 2;
//        System.out.println("Mana: " + mana);
//
//        // DIVISION /=
//        mana /= 4;
//        System.out.println("Mana: " + mana);
//
//        // MODULO (REMAINDER)
//        mana %= 2;
//        System.out.println("Mana: " + mana);

//        // If & Switch Statements - 8
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How much health do you have?");
//        int health = scanner.nextInt();
//        boolean isAlive = health > 0;
//
//        if(isAlive) {
//            System.out.println("You are still alive!");
//        }
//        else {
//            System.out.println("Oh..");
//        }
//
//        System.out.println("How many points do you have?");
//        int points = scanner.nextInt();
//
//        if(points >= 100) {
//            System.out.println("You passed with HONOURS!");
//        }
//        else if (points >= 50) {
//            System.out.println("You passed?");
//        }
//        else{
//            System.out.println("You failure.");
//        }
//
//        //SWITCH
//        int x = 3;
//        switch (x){
//            default: System.out.println("X is unknown");
//            case 0: System.out.println("X = 0"); break;
//            case 1: System.out.println("X = 1"); break;
//            case 2: System.out.println("X = 2"); break;
//            case 3: System.out.println("X = 3"); break;
//
//        }

        // LOOPS (FOR & WHILE) - 9

//        for(int i = 0; i < 100; i++){
//            System.out.println(i);
//        }
//
//        // 50% chance
//        for(int i = 0; i < 100; i++) {
//            if (i % 2 != 0) {
//
//                System.out.println(i);
//            }
//        }
//
//        // Leap Year
//        for(int i = 1000; i <= 2000; i++){
//            if(i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)){
//                System.out.println(i);
//            }
//        }

        // While Loop
//        int health = 10;
//
//        while(health > 0){
//            health--;
//            if(health == 6){
//                continue;
//            }
//            if(health == 2){
//                break;
//            }
//            System.out.println("Player still alive with " + health + "HP");
//        }






    }
}
