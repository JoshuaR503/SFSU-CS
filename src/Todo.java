import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Todo {
    public static void main(String[] args) {

        /// Keep track of prompt message.
        String message = "Would you like to order anything?";

        /// Keep track of ordering status.
        boolean stillOrdering = true;

        /// Keep track of user orders.
        final ArrayList<String> orders = new ArrayList<String>();

        /// Welcome user to restaurant.
        System.out.println("Welcome to Joshua's restaurant.");

        do {
            /// Ask user if they want to order anything.
            System.out.println(message);

            /// Create new instance of scanner to receive user input.
            final Scanner scanner = new Scanner(System.in);
            /// Store response.
            final String response = scanner.nextLine();

            /// Determine program behavior based on response.
            if (response.equals("yes")) {
                /// Ask user what they'd like to order.
                System.out.println("What would you like to order?");
                /// Store response in a variable.
                final String order = scanner.nextLine();
                /// Add response to list.
                orders.add(order);
                /// Update prompt message
                message = "Would you like to order anything else?";
            } else {
                stillOrdering = false;
            }
        } while (stillOrdering);

        /// Finish program by printing order.
        System.out.println("You ordered: " + orders.toString());
    }
}
