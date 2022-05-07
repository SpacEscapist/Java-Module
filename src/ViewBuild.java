// This class provides the user with a view of their build and total build cost

public class ViewBuild {

    public static void displayBuild() {

        // Initialize the sum of total cost
        float sum = 0;

        // Display items in buildItems Array on separate lines
        System.out.println(
                "\n-----------------------------------------\n--My Build--");

        // Loop through each item in buildItems Array
        for (int i = 0; i < BuildPc.buildItems.size(); i++) {
            System.out.println(BuildPc.buildItems.get(i));
        }
        ;

        // Display items in buildItems Array on separate lines
        System.out.println(
                "\n--Total Build Cost--");

        // Loop through each item in buildCosts Array and add them together
        for (int j = 0; j < BuildPc.buildCosts.size(); j++) {
            sum += BuildPc.buildCosts.get(j);
        }

        // Display total cost to user and format cost with 2 decimals places
        String formatSum = String.format("%.2f", sum);
        System.out.println("$" + formatSum);

    }

}
