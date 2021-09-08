/*
 * Assignment 2
 * Description: Average calculator
 * Name: Joshua Garcia
 * ID: 921986504
 * Class: CSC 0210-08
 * Semester: Fall 2021
 */
import java.util.Scanner;

public class AverageCalc {
    public static void main(String[] args) {
        // Create a new instance of a scanner to take in user input.
        final Scanner scanner = new Scanner(System.in);

        // Prompt the user to insert 3 numbers.
        System.out.println("Please enter three numbers");

        // Store the numbers the user saved.
        final String userInput = scanner.nextLine();

        // Make sure input is not empty.
        if (userInput.isEmpty()) {
            System.out.println("Input can't be empty");
            System.exit(0);
        }

        System.out.println("You entered " + userInput);

        // Make sure string only contains numbers.
//        if (userInput.matches("[0-9]+")) {
//            System.out.println("Make sure you only enter numbers.");
//            System.exit(0);
//        }

        // Convert string into array of string to store.
        final String[] userNumbers = userInput.split(" ");

        // Make sure user entered only 3 numbers.
        if (userNumbers.length > 3 || userNumbers.length < 3) {
            System.out.println("You need to enter 3 numbers.");
            System.exit(0);
        }

        // Convert array of strings into an array of numbers.
        final double[] doubleArr = convertStringArrToDoubleArr(userNumbers);

        // Calculate average.
        final double average = calculateTotalSumFromArr(doubleArr) / doubleArr.length;

        // Print out average.
        System.out.format("The average is: %.3f", average);
    }

    public static double[] convertStringArrToDoubleArr (String[] stringArr) {
        // Create variable to store doubles.
        final double[] numbers = new double[stringArr.length];

        // Loop over array to string and convert each value into an integer.
        for(int i = 0; i < stringArr.length; i++) {
            numbers[i] = Double.parseDouble(stringArr[i]);
        }

        // Return array of doubles.
        return numbers;
    }

    public static double calculateTotalSumFromArr(double[] doubleArr) {
        // Create variable to store sum.
        double total = 0;

        // Loop over array and add current value to last value of total
        for( int i=0; i < doubleArr.length; i++ ){
            total += doubleArr[i];
        }

        // Return total.
        return total;
    }
}
