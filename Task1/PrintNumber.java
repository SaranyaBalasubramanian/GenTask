package GenTask.Task1;
//1.Write a Program to print the number from 10 to 50 using for loop /while loop.
public class PrintNumber {
    public static void main(String[] args) {
        //for loop
        System.out.println("Using for Loop");
        for (int i = 10; i <=50 ; i++) {
            System.out.println(i);
        }
        // while loop
        System.out.println("Using while loop");
        int i = 10;
        while (i<=50){
            System.out.println(i);
            i++;
        }
    }
}
