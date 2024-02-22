package GenTask.Task1;

import java.util.Scanner;

//5.Write a program that takes a purchase amount as input and calculate the final payable amount after applying discount.
//(i)If purchase amount is less than 500 no discount
//(ii)If the purchase amount is between 500 and 1000 ,a 10 % discount applied
//(iii)If the purchase amount is greater than 1000 ,a 20 % discount applied
public class PurchaseAmount {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double amount = Scanner.nextDouble();

        System.out.println("Purchase amount :"+amount);
        double finalAmount;
        if (amount <500) {
                System.out.println("No Discount");
        }else if (amount>=500 && amount<=1000){
            finalAmount = amount -(amount*0.10);
            System.out.println("10% Discount Applied "+finalAmount);

        }else {
            finalAmount = amount -(amount*0.20);
            System.out.println("20% Discount Applied "+finalAmount);
        }



        Scanner.close();
    }

}
