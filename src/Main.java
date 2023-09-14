import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<String> list = new ArrayList<>(); // A list created here to be reachable over the whole program.

    // A simple method to print out the list if its not empty.
    static void showList() {
        if (list.isEmpty()) {
            System.out.println("\nList is empty...");
        }
        else {
            System.out.println("\nList:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i+1) + ". " + list.get(i));
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isRunning = true; // Used in while loop to keep the program running until set to false.
        while (isRunning) {
            // Present program name and the main menu.
            System.out.println("TODO LIST");
            System.out.println("1. Add item" +
                    "\n2. Delete item" +
                    "\n3. View list" +
                    "\n4. Exit program");
            System.out.print("Enter: ");
            String choice = input.nextLine(); // user choice.
            System.out.println();

            switch (choice) {
                // Adding items to list.
                case "1": {
                    String a = "0"; // Just a random start value.
                    while (!a.equals("")) { // While a is NOT empty.
                        System.out.print("Add something to the list ( ENTER to cancel ) : ");
                        a = input.nextLine(); // User inputs item to list.
                        if (!a.equals("")) { // a is NOT empty.
                            list.add(a); // Add a to ArrayList.
                            System.out.println("\"" + a + "\" was added to the list!\n");
                        }
                    }
                    System.out.println();
                    break;
                }
                // Deleting items from list.
                case "2": {
                    showList(); // See method above.
                    while (!list.isEmpty()) {
                        System.out.print("What item do you want to delete? Please enter a number: ");
                        // TryCatch to handle InputMismatch.
                        try {
                            int a = (input.nextInt() - 1); // -1 because example: 1 is actually 0 in list.
                            if (a >= 0 && a < list.size()) { // Handles negative and out of bounds values.
                                System.out.println("Item \"" + list.get(a) + "\" was deleted from the list.\n");
                                list.remove(a);
                            }
                            else
                                System.out.println("\nMust be a number on the list!\n");
                            break;
                        }
                        catch (InputMismatchException e) {
                            System.out.print("Choose a number from the list, please try again: ");
                        }
                    }
                    input.nextLine();
                    break;
                }
                // Just to print out the list if not empty.
                case "3": {
                    showList(); // See method above.
                    System.out.println("Please press ENTER to continue...");
                    input.nextLine();
                    break;
                }
                // Exits the program.
                case "4": {
                    isRunning = false;
                    break;
                }
                // Handles all wrong inputs when you get to choose in the main menu.
                default:
                    System.out.println("\nPlease enter a number from the menu...\n");
                    break;
            }
        }
    }
}