// QuartsToGallonsInteractive.java
// This program prompts the user to enter the number of quarts needed,
// then calculates and displays how many gallons and extra quarts that makes.

import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4; // Constant value for conversion

        Scanner input = new Scanner(System.in); // Create Scanner object for input

        // Ask the user to enter how many quarts are needed
        System.out.print("Enter the number of quarts needed for the job: ");
        int quartsNeeded = input.nextInt();

        // Calculate gallons and remaining quarts
        int gallons = quartsNeeded / QUARTS_IN_GALLON;
        int remainingQuarts = quartsNeeded % QUARTS_IN_GALLON;

        // Display the formatted result
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " +
                gallons + " gallons plus " + remainingQuarts + " quarts.");
    }
}