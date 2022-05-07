// This class starts the Computer Builder Assistant program and provides a menu for user input

import java.util.Scanner; // Import Scanner class

public class App {

    // Call the buildMyPc() method from BuildPc class
    public static void option1() {
        BuildPc.buildMyPc();
    }

    // Call the editBuild() method from EditBuild class
    public static void option2() {
        EditBuild.editBuild();
    }

    // Call the displayBuild() method from ViewBuild class
    public static void option3() {
        ViewBuild.displayBuild();
    }

    // Method that displays to the user that their order is "processing"
    public static void option4() {
        System.out.println(
                "\n-----------------------------------------\nProcessing...\n......\n........\n..........\n............\nYour order has processed successfully");
    };

    // Main Menu: Prompt for user input
    public static void userPrompt() {

        // Provide scanner to listen for user input
        Scanner userInput = new Scanner(System.in);

        // Initialize user input
        int n = 0;

        // Loop runs while the user does NOT select option 5
        while (n != 5) {

            // Menu options
            System.out.println(
                    "\n-----------------------------------------\nWhat would you like to do?\n1. Build My PC\n2. Edit My Build\n3. View Build & Cost\n4. Process/Complete My Build\n5. Quit the Program\n\nSelect an option:");

            // Get user input
            n = userInput.nextInt();

            // Call method based on user input from the menu
            if (n == 1) {
                option1();
            } else if (n == 2) {
                option2();
            } else if (n == 3) {
                option3();
            } else if (n == 4) {
                option4();
            } else if (n == 5) {
                System.out.println(
                        "\n-----------------------------------------\nExiting program. Thank you for visiting!\n");
            } else {
                System.out.println("\n=== Please enter a valid option ===");
            }
        }

        // Close the scanner
        userInput.close();
    }

    // Give the user a welcome message
    public static void welcome() {
        System.out.println(
                "\n-----------------------------------------\nHello! Welcome to the Computer Builder Assistant App");
    }

    // Start the program
    public static void main(String[] args) throws Exception {
        welcome();
        userPrompt();
    }

}
