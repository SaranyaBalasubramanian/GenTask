package GenTask.Task1;
//3.Write a program to Reverse given number using loops input = 876 output = 678

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int number = Scanner.nextInt();

        int reversedNumber = reversedNumber(number);

        System.out.println("Reversed number: " + reversedNumber);
        Scanner.close();
    }
public static int reversedNumber(int number){
int reversedNumber = 0;

//While loop
    while(number !=0){
        int digit = number %10;
        reversedNumber = reversedNumber *10+digit;
        number/=10;
    }
    return reversedNumber;
}

}
