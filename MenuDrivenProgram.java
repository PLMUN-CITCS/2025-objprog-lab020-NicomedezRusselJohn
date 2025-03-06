import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop to keep displaying the menu until the user chooses to exit
        do {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");

            // Validate input
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next();
            }

            choice = scanner.nextInt();
            handleMenuChoice(choice);
        } while (choice != 3);

        scanner.close();
    }

    // Method to display the menu
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // Method to handle the user's choice
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    // Method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Method to check if a number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next();
        }

        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
