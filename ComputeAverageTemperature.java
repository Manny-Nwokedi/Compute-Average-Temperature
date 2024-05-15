// Java Program to Compute Average Temperature
// MANNY-NWOKEDI
import java.util.Scanner;

public class ComputeAverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from the user
        System.out.print("Enter the number of temperatures: ");
        int numberOfTemperatures = scanner.nextInt();

        // Step 2: Prompt the user to enter all the temperatures
        System.out.println("Enter the temperatures, one by one:");
        int[] temperatures = new int[numberOfTemperatures];
        for (int i = 0; i < numberOfTemperatures; i++) {
            System.out.print("Temperature " + (i + 1) + ": ");
            temperatures[i] = scanner.nextInt();
        }

        // Step 3: Calculate the average temperature
        double averageTemperature = calculateAverage(temperatures);

        System.out.println("Average temperature: " + averageTemperature);

        // Step 4: Count how many temperatures are above the average temperature
        int aboveAverageCount = countAboveAverage(temperatures, averageTemperature);

        System.out.println("Number of days above average temperature: " + aboveAverageCount);

        scanner.close();
    }

    // Method to calculate the average temperature
    private static double calculateAverage(int[] temperatures) {
        int sum = 0;
        for (int temp : temperatures) {
            sum += temp;
        }
        return (double) sum / temperatures.length;
    }

    // Method to count temperatures above the average temperature
    private static int countAboveAverage(int[] temperatures, double averageTemperature) {
        int count = 0;
        for (int temp : temperatures) {
            if (temp > averageTemperature) {
                count++;
            }
        }
        return count;
    }
}