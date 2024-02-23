package GenTask.Task5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Scanner;

//4.Rajesh has been given a task to create an app which the user's birthdate as input
// and calculates their age, you have to help him to bulid this app using the java.time.LocalDate class.
//Input :
//Enter your brithdate (yyyy-mm-dd):1990-05-15
//output :
//Your age is:33 years,4 months,and 13 days.
public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input birthdate from the user
        System.out.println("Enter your birthday(yyyy-mm-dd): ");
        String brithdateStr = scanner.nextLine();

        // Parse the birthdate string into a LocalDate object
        LocalDate brithdate = LocalDate.parse(brithdateStr);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the difference between the birthdate and the current date
        Period age = Period.between(brithdate,currentDate);

        System.out.println("Your age is: "+age.getYears()+" Years "+age.getMonths()+ " Months "+age.getDays()+" days. ");

        scanner.close();
    }
}
