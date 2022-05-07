// This class provides the user with a menu to Build their PC

import java.util.Scanner; // Import Scanner class
import java.util.ArrayList; // Import ArrayList class

public class BuildPc {

    // Provide scanner to listen for user input
    static final Scanner buildInput = new Scanner(System.in);

    // Initialize an ArrayList to hold computer items
    static ArrayList<String> buildItems = new ArrayList<String>() {
        {
            add("");
            add("");
            add("");
            add("");
        }
    };
    // Initialize an ArrayList to hold item prices
    static ArrayList<Integer> buildCosts = new ArrayList<Integer>() {
        {
            add(0);
            add(0);
            add(0);
            add(0);
        }
    };

    // Method call that provides the user with options for the item: Tower
    public static void option1() {
        // Initialize user input
        int option1 = 0;

        // Loop runs while the user does NOT select option 1 or 2
        while (option1 != 1 && option1 != 2) {
            System.out.println(
                    "\n-----------------------------------------\n--Tower/Case--\n1. Small Tower --- $45.00\n2. Large Tower --- $99.00\n\nSelect Tower/Case:");

            // Get user input
            option1 = buildInput.nextInt();

            // Places item and price into separate Arrays at 0 index
            if (option1 == 1) {
                buildItems.set(0, "Small Tower - $45.00");
                buildCosts.set(0, 45);
            } else if (option1 == 2) {
                buildItems.set(0, "Large Tower - $99.00");
                buildCosts.set(0, 99);
            } else {
                System.out.println("\n=== Please enter a valid option ===");
            }
        }
    }

    // Method call that provides the user with options for the item: CPU
    public static void option2() {
        int option2 = 0;

        // Loop runs while the user does NOT select option 1 or 2
        while (option2 != 1 && option2 != 2) {
            System.out.println(
                    "\n-----------------------------------------\n--CPU--\n1. Slow CPU --- $150.00\n2. Fast CPU --- $300.00\n\nSelect CPU:");

            // Get user input
            option2 = buildInput.nextInt();

            // Places item and price into separate Arrays at 1 index
            if (option2 == 1) {
                buildItems.set(1, "Slow CPU - $150.00");
                buildCosts.set(1, 150);
            } else if (option2 == 2) {
                buildItems.set(1, "Fast CPU - $300.00");
                buildCosts.set(1, 300);
            } else {
                System.out.println("\n=== Please enter a valid option ===");
            }
        }
    }

    // Method call that provides the user with options for the item: RAM
    public static void option3() {
        int option3 = 0;

        // Loop runs while the user does NOT select option 1 or 2
        while (option3 != 1 && option3 != 2) {
            System.out.println(
                    "\n-----------------------------------------\n--RAM--\n1. Less RAM --- $80.00\n2. Lots of RAM --- $165.00\n\nSelect RAM:");

            // Get user input
            option3 = buildInput.nextInt();

            // Places item and price into separate Arrays at 2 index
            if (option3 == 1) {
                buildItems.set(2, "Less RAM - $80.00");
                buildCosts.set(2, 80);
            } else if (option3 == 2) {
                buildItems.set(2, "Lots of RAM - $165.00");
                buildCosts.set(2, 165);
            } else {
                System.out.println("\n=== Please enter a valid option ===");
            }
        }
    }

    // Method call that provides the user with options for the item: Hard Drive
    public static void option4() {
        int option4 = 0;

        // Loop runs while the user does NOT select option 1 or 2
        while (option4 != 1 && option4 != 2) {
            System.out.println(
                    "\n-----------------------------------------\n--Hard Drive--\n1. Hard Drive w/ Small Capacity --- $100.00\n2. Hard Drive w/ Large Capacity --- $200.00\n\nSelect Hard Drive:");

            // Get user input
            option4 = buildInput.nextInt();

            // Places item and price into separate Arrays at 3 index
            if (option4 == 1) {
                buildItems.set(3, "Hard Drive w/ Small Capacity - $100.00");
                buildCosts.set(3, 100);
            } else if (option4 == 2) {
                buildItems.set(3, "Hard Drive w/ Large Capacity - $200.00");
                buildCosts.set(3, 200);
            } else {
                System.out.println("\n=== Please enter a valid option ===");
            }
        }
    }

    // Build My PC Menu: Prompt for user input
    public static void buildMyPc() {

        // Initialize user input
        int o = 0;

        while (o != 5) {

            // Menu options
            System.out.println(
                    "\n-----------------------------------------\n--Build My PC--\n1. Tower/Case\n2. CPU\n3. RAM\n4. Hard Drive\n5. Done\n\nSelect option to build:");

            // Get user input
            o = buildInput.nextInt();

            // Call method based on user input from the menu
            if (o == 1) {
                option1();
            } else if (o == 2) {
                option2();
            } else if (o == 3) {
                option3();
            } else if (o == 4) {
                option4();
            } else if (o == 5) {
                break;
            } else {
                System.out.println("\n=== Please enter a valid option ===");
            }
        }
    }
}
