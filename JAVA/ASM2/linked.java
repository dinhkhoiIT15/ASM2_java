package ASM2;

import java.util.LinkedList;
import java.util.Scanner;

public class linked {
    public static void main(String[] args) {
        LinkedList<String> nameList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nName List Program");
            System.out.println("1. Add a name");
            System.out.println("2. Delete a name");
            System.out.println("3. List all names");
            System.out.println("4. Quit");
            System.out.print("Select an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter a name to add: ");
                    String newName = scanner.nextLine();
                    nameList.add(newName);
                    System.out.println(newName + " has been added to the list.");
                    break;
                case 2:
                    System.out.print("Enter a name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    if (nameList.remove(nameToDelete)) {
                        System.out.println(nameToDelete + " has been deleted from the list.");
                    } else {
                        System.out.println(nameToDelete + " is not in the list.");
                    }
                    break;
                case 3:
                    System.out.println("List of Names:");
                    for (String name : nameList) {
                        System.out.println(name);
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option (1-4).");
            }
        }
    }
}
