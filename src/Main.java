import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TODO LIST");
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("1. Add item" +
                    "\n2. Delete item" +
                    "\n3. View list" +
                    "\n4. Exit program");
            System.out.print("Enter: ");
            String choice = input.nextLine();
            switch (choice) {
                case "1": {
                    break;
                }
                case "2": {
                    break;
                }
                case "3": {
                    break;
                }
                case "4": {
                    isRunning = false;
                    break;
                }
                default:
                    System.out.println("\nPlease enter a number from the menu...\n");
            }
        }
    }
}