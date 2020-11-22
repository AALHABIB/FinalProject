// importing packages for clearing the screen and using the scanner to get user input

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Calculator {
    // Using this method to clear the screen
    public static void clrscr() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException exception) {

        }
    }
    // Using this method to listen to user's key strokes
    public static void pressAnyKey() {
        System.out.println("Press Any Key to Continue!");
        try {
            System.in.read();
        }
        catch (Exception e)
        {}
    }
    // Using this method to display the menu
    public static void displayMenu() {
        System.out.println("================\n  My Calculator\n================");
        System.out.println("Created by:\n\tAbdulrahman Alhabib\n\tAhmed Alghamdi\n\tFeras Alotaibi\n\tAbdulellah Khalid");
        System.out.println("\t\t**menu**");
        System.out.println("1- Addition \n2- Subtraction \n3- Division \n4- Multiplication \n5- Remainder \n6- Square Root \n7- Absolute Value \n8- End");
    }




    // Main function || With exception for sleep interruption by user
    public static void main(String[] args) throws InterruptedException {
        // initializing scanner
        Scanner input = new Scanner(System.in);
        // Initializing variables to check user input later on
        int userMenuInput = 0;
        boolean isInt;
        boolean isDouble;

        // Throw everything in a while loop
        while (true) {
            //displays the menu
            displayMenu();

            // Save User input to a variable
            do {
                // Prompt user for a choice from the menu
                System.out.println("Please choose an option from the Menu:");
                // check if user input is correct
                if(input.hasNextInt()) {
                    userMenuInput = input.nextInt();
                    isInt = true;
                } else {
                    // if choice is not an int, the user is prompted to try again
                    System.out.println("Please enter a correct number and try again!");
                    isInt = false;
                    input.next();
                }
            } while (!isInt);
            // clear the screen
            clrscr();
            // initialize variables for user input calculations
            double x = 0, y = 0;

            // Perform appropriate calculation depending on user inputs
            switch (userMenuInput) {

                case 1:
                    System.out.println("\tAddition\n+++++++++++++++++++++++++++++++++++");
                    x = getX(input, x);
                    y = getY(input, y);
                    System.out.println(x + " + " + y + " = " + (x + y));
                    TimeUnit.SECONDS.sleep(2);
                    break;

                case 2:
                    System.out.println("\tSubtraction\n-------------------------------");
                    x = getX(input, x);
                    y = getY(input, y);
                    System.out.println(x + " - " + y + " = " + (x - y));
                    TimeUnit.SECONDS.sleep(2);
                    break;

                case 3:
                    System.out.println("\tDivision\n÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷");
                    x = getX(input, x);
                    y = getY(input, y);
                    System.out.println(x + " / " + y + " = " + (x / y));
                    TimeUnit.SECONDS.sleep(2);
                    break;

                case 4:
                    System.out.println("\tMultiplication\n××××××××××××××××××××××××××××");
                    x = getX(input, x);
                    y = getY(input, y);
                    System.out.println(x + " × " + y + " = " + (x * y));
                    TimeUnit.SECONDS.sleep(2);
                    break;

                case 5:
                    System.out.println("\tRemainder\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    x = getX(input, x);
                    y = getY(input, y);
                    System.out.println(x + " % " + y + " = " + (x % y));
                    TimeUnit.SECONDS.sleep(2);
                    break;

                case 6:
                    System.out.println("\tSquare Root\n================================");
                    x = getX(input, x);
                    System.out.println("The Square Root of:" + x + " = " + (Math.sqrt(x)));
                    TimeUnit.SECONDS.sleep(2);
                    break;

                case 7:
                    System.out.println("\tAbsolute Value\n|||||||||||||||||||||||||||||||");
                    x = getX(input, x);
                    System.out.println("The Absolute Value of:" + x + " = " + (Math.abs(x)));
                    break;

                case 8:
                    System.out.println("Calculator closed successfully");
                    TimeUnit.SECONDS.sleep(2);
                    System.exit(0);
                    break;

                default:
                    // if user choice is outside of our menu range, user will be notified and prompted to try again
                    System.out.println("Please make sure your choice is within our menu and try again!");
                    TimeUnit.SECONDS.sleep(2);
            }
            // listen to key press by user
            pressAnyKey();
            clrscr();
        }
    }
    // This method validates that user input Y is a double. Clears scanner and asks for new input if not a double
    private static double getY(Scanner input, double y) {
        boolean isDouble;
        do {
            System.out.println("Please type in the SECOND number:");
            // check if user input is correct
            if(input.hasNextDouble()) {
                y = input.nextDouble();
                isDouble = true;
            } else {
                System.out.println("Please enter a correct number and try again!");
                isDouble = false;
                input.next();
            }
        } while (!isDouble);
        return y;
    }


    // This method validates that user input X is a double. Clears scanner and asks for new input if not a double
    private static double getX(Scanner input, double x) {
        boolean isDouble;
        do {
            System.out.println("Please type in the FIRST number:");
            // check if user input is correct
            if(input.hasNextDouble()) {
                x = input.nextDouble();
                isDouble = true;
            } else {
                System.out.println("Please enter a correct number and try again!");
                isDouble = false;
                input.next();
            }
        } while (!isDouble);
        return x;
    }
}
