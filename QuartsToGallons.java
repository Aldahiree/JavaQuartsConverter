// QuartsToGallons.java
// This program converts quarts to gallons using named constants and displays the result.

public class QuartsToGallons {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4; // Named constant for quarts in a gallon
        int quartsNeeded = 18;          // Variable to store total quarts needed

        // Calculate how many full gallons and remaining quarts are needed
        int gallons = quartsNeeded / QUARTS_IN_GALLON;
        int remainingQuarts = quartsNeeded % QUARTS_IN_GALLON;

        // Output the result with explanatory text
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " +
                gallons + " gallons plus " + remainingQuarts + " quarts.");
    }
}