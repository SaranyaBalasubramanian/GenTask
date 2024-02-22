package GenTask.Task1;

import java.util.Scanner;

//4.Write a java program to find Smallest number among three Number.
public class FindSmallnum {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        int num1 = Scanner.nextInt();
        int num2 = Scanner.nextInt();
        int num3 = Scanner.nextInt();

        //find smallest
        int Smallest = num1;

        if (num2<Smallest){
           Smallest = num2;
        }
        if (num3<Smallest){
            Smallest = num3;
        }
        System.out.println("Smallest number: "+Smallest );

        Scanner.close();

    }
}
