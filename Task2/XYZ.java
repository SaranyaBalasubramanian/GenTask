package GenTask.Task2;

import java.util.Scanner;

//Default constructor
class Product{
    private int pid;
    private double price;
    private int quality;

//Parameterized constructor
public  Product(int pid, double price, int quality){
    this.pid = pid;
    this.price = price;
    this.quality = quality;
}
//getter method for pid,price,quality
public int getpid(){
    return pid;
}
public double getprice(){
    return price;
}
public int getquality(){
    return quality;
}
}
public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Accept five Product information from the user and store in an array

        Product[] Products = new Product[5];
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Enter details of product"+(i+1)+":");
            System.out.println("Enter Pid: ");
            int pid = scanner.nextInt();
            System.out.println("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.println("Enter quality: ");
            int quality = scanner.nextInt();
            Products[i] = new Product(pid,price,quality);
        }
        // Find pid of the product with the highest price
        int maxPid = getMaxPid(Products);
        System.out.println("PID of the product with the highest price: " + maxPid);

        // Calculate and return the total amount spent on all products
        double totalAmount = calculateTotalAmount(Products);
        System.out.println("Total amount spent on all products: $" + totalAmount);

        scanner.close();
    }
    // Method to find pid of the product with the highest price
    private static int getMaxPid(Product[] products){
        double maxPrice = products[0].getprice();
        int maxPid = products[0].getpid();
        for (int i = 1; i < products.length; i++) {
            if(products[i].getprice()>maxPrice){
                maxPrice = products[i].getprice();
                maxPid=products[i].getpid();
            }
            
        }
return maxPid;
    }
    // Method to calculate total amount spent on all products
    private static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getprice() * product.getquality();
        }
        return totalAmount;
    }
}
