/*
 * Hello World
 * Description: I think this is my homework
 * Name: Joshua Garcia
 * ID: 921986504
 * Class: CSC 0210-08
 * Semester: Fall 2021
 */

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for radius: ");

        double radius = scanner.nextInt();

        System.out.println("Value of radius is " + radius);
    }
}