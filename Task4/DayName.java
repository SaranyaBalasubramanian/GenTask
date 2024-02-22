package GenTask.Task4;
import java.util.Scanner;
//3.Store name of weekdays in an array (starting from "sunday" at 0 index).
//Ask day position from user and print day name.Handle array index out of bound exception and give proper message if user enters day index outside range(0-6).

public class DayName {
    public static void main(String[] args) {
        // Array to store the names of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day position (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int dayPosition = scanner.nextInt();

        try {
            // Print the name of the day based on the user input
            String dayName = getDayName(weekdays, dayPosition);
            System.out.println("The day at position " + dayPosition + " is " + dayName);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bounds exception
            System.out.println("Error: Day position should be between 0 and 6.");
        }
    }

    // Method to get the day name from the array based on the given position
    public static String getDayName(String[] weekdays, int dayPosition) {
        // Check if the day position is within the array bounds
        if (dayPosition < 0 || dayPosition >= weekdays.length) {
            // Throw array index out of bounds exception if the position is outside the valid range
            throw new ArrayIndexOutOfBoundsException();
        }
        return weekdays[dayPosition];
    }
}


