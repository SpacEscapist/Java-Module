// This class provides the user with a menu to Edit their PC build

import java.util.Scanner; // Import Scanner class

public class EditBuild {

    // Provide scanner to listen for user input
    static final Scanner editBuildInput = new Scanner(System.in);

    // Edit My Build Menu: Prompt for user input
    public static void editBuild() {

        // Initialize user input
        int o = 0;

        // Loop runs while the user does NOT select option 5
        while (o != 5) {

            // Menu options
            System.out.println(
                    "\n-----------------------------------------\n--Edit My Build--\n1. Tower/Case\n2. CPU\n3. RAM\n4. Hard Drive\n5. Done\n\nSelect option to change:");

            // Get user input
            o = editBuildInput.nextInt();

            // Call method based on user input from the menu
            if (o == 1) {
                BuildPc.option1();
            } else if (o == 2) {
                BuildPc.option2();
            } else if (o == 3) {
                BuildPc.option3();
            } else if (o == 4) {
                BuildPc.option4();
            } else if (o == 5) {
                break;
            } else {
                System.out.println("\n=== Please enter a valid option ===");
            }
        }
    }

}
