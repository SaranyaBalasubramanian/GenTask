package GenTask.Task1;
//2.Write a program to find number is positive or negative
import java.util.Scanner;

public class NumNegPos {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int Number = Scanner.nextInt();
        //Check Postive or Negative

        if (Number > 0){
            System.out.println("Number is Positive");
        } else if (Number<0) {
            System.out.println("Number is Negative");
        }else
        {
            System.out.println("Number is Zero");
        }
        Scanner.close();

    }
}
