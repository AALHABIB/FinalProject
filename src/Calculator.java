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
        System.out.println("Created by:\n\tAbdulrahman Alhabib\n\tStudent 2\n\tStudent 3\n\tStudent 4");
        System.out.println("\t\t**menu**");
        System.out.println("1- Addition \n2- Subtraction \n3- Division \n4- Multiplication \n5- Remainder \n6- Square Root \n7- Absolute Value \n8- End");
    }
    // Main function || With exception for sleep interruption by user
    public static void main(String[] args) throws InterruptedException {
        // initializing scanner
        Scanner input = new Scanner(System.in);

        // Throw everything in a while loop
        while (true) {
            // Does what it says, displays the menu

            displayMenu();
            // Get user input
            System.out.println("Please choose an option from the Menu:");
            // Save User input to a variable
            int userMenuInput = input.nextInt();
            // clear the screen
            clrscr();
            // initialize variables for user input calculations
            double x = 0, y = 0;
            // Perform appropriate calculation depending on user input
            switch (userMenuInput) {

                case 1:
                    System.out.println("\tAddition\n+++++++++++++++++++++++++++++++++++");
                    System.out.println("Please type in the FIRST number:");
                    x = input.nextDouble();
                    System.out.println("Please type in the SECOND number:");
                    y = input.nextDouble();
                    System.out.println(x + " + " + y + " = " + (x + y));
                    TimeUnit.SECONDS.sleep(2);
                    break;

                case 2:
                    System.out.println("\tSubtraction\n-------------------------------");
                    System.out.println("Please type in the FIRST number:");
                    x = input.nextDouble();
                    System.out.println("Please type in the SECOND number:");
                    y = input.nextDouble();
                    System.out.println(x + " - " + y + " = " + (x - y));
                    TimeUnit.SECONDS.sleep(2);
                    break;

                case 3:
                    System.out.println("\tDivision\n÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷÷");
                    System.out.println("Please type in the FIRST number:");
                    x = input.nextDouble();
                    System.out.println("Please type in the SECOND number:");
                    y = input.nextDouble();
                    System.out.println(x + " / " + y + " = " + (x / y));
                    TimeUnit.SECONDS.sleep(2);
                    break;

                case 4:
                    System.out.println("\tMultiplication\n××××××××××××××××××××××××××××");
                    System.out.println("Please type in the FIRST number:");
                    x = input.nextDouble();
                    System.out.println("Please type in the SECOND number:");
                    y = input.nextDouble();
                    System.out.println(x + " × " + y + " = " + (x * y));
                    TimeUnit.SECONDS.sleep(2);
                    break;

                case 5:
                    System.out.println("\tRemainder\n%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
                    System.out.println("Please type in the FIRST number:");
                    x = input.nextDouble();
                    System.out.println("Please type in the SECOND number:");
                    y = input.nextDouble();
                    System.out.println(x + " % " + y + " = " + (x % y));
                    TimeUnit.SECONDS.sleep(2);
                    break;

                case 6:
                    System.out.println("\tSquare Root\n√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√√");
                    System.out.println("Please type in a number:");
                    x = input.nextDouble();
                    System.out.println("The Square Root of:" + x + " = " + (Math.sqrt(x)));
                    TimeUnit.SECONDS.sleep(2);
                    break;

                case 7:
                    System.out.println("\tAbsolute Value\n|||||||||||||||||||||||||||||||");
                    System.out.println("Please type in a number:");
                    x = input.nextDouble();
                    System.out.println("The Absolute Value of:" + x + " = " + (Math.abs(x)));

                case 8:
                    System.out.println("Calculator is closed successfully");
                    TimeUnit.SECONDS.sleep(2);
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please make sure your choice is within our menu and try again!");
                    TimeUnit.SECONDS.sleep(2);
            }
            // listen to key press by user
            pressAnyKey();
            clrscr();
        }
    }
}
