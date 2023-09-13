import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TODO LIST");
        boolean isRunning = true;
        ArrayList<String> list = new ArrayList<>();
        while (isRunning) {
            System.out.println("1. Add item" +
                    "\n2. Delete item" +
                    "\n3. View list" +
                    "\n4. Exit program");
            System.out.print("Enter: ");
            String choice = input.nextLine();
            System.out.println();
            switch (choice) {
                case "1": {
                    System.out.println("Add something to the list: ");
                    String a = input.nextLine();
                    list.add(a);
                    System.out.println(a + " was added to the list!");
                    System.out.println();
                    break;
                }
                case "2": {
                    break;
                }
                case "3": {
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