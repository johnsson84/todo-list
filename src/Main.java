import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static ArrayList<String> list = new ArrayList<>();

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
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("TODO LIST");
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
                    showList();
                    while (!list.isEmpty()) {
                        System.out.print("What item do you want to delete? Please enter a number: ");
                        try {
                            int a = (input.nextInt() - 1);
                            System.out.println("Item " + list.get(a) + " was deleted from the list.\n");
                            list.remove(a);
                            break;
                        }
                        catch (InputMismatchException e) {
                            System.out.print("Choose a number from the list, please try again: ");
                        }
                    }
                    input.nextLine();
                    break;
                }
                case "3": {
                    showList();
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