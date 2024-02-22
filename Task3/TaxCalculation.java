package GenTask.Task3;

//2.Create Interface taxable with members salesTax=7% and incometax = 10.5%.Create abstract method calcTax().
//a.Create class Employee(empID,name,salary)and implement taxable to calculate incometax on yearly salary.
//b.Create class Product(pid,price,quality)and implement taxable to calculate salestax on unit price of product.
//c.create class for main method(say XYZ),accept employee information and a product information from user and print income tax and salea tax respectively.

//Interface



import java.util.Scanner;

interface Taxable{
    double salesTax = 0.07 ;//7%
    double incomeTax = 0.105;//10.5%

    double calTax();

    class Employee1 implements Taxable{
       private String empID;
        private String name;
        private double salary;

        public Employee1(String empID,String name,double salary){
            this.empID=empID;
            this.name= name;
            this.salary=salary;
        }
        // Implementing calcTax method for income tax calculation
        public double calTax(){
            double yearlysalary = salary *12;
            return yearlysalary*incomeTax;
        }
    }
    class Product implements Taxable{
        private String pdid;
        private double price;
        private int quality;

        public Product(String pdid,double price,int quality){
            this.pdid=pdid;
            this.price= price;
            this.quality=quality;

        }
        // Implementing calcTax method for sales tax calculation
        public double calTax(){
            return salesTax*price;
        }
    }

}

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Accept employee information
        System.out.println("Enter Employee ID :");
        String empID = scanner.nextLine();
        System.out.println("Enter Employee Name :");
        String empName = scanner.nextLine();
        System.out.println("Enter Employee Salary :");
        double empSalary = scanner.nextDouble();
        Taxable.Employee1 employee = new Taxable.Employee1(empID,empName,empSalary);
        double incometax = employee.calTax();
        System.out.println("Income tax for "+empName+" : "+incometax);

        // Accept product information

        System.out.println("Enter Product ID :");
        String pdid = scanner.nextLine();
        System.out.println("Enter Product Price :");
        double price = scanner.nextDouble();
        System.out.println("Enter Product Quality :");
        int quality = scanner.nextInt();
        Taxable.Product Product = new Taxable.Product(pdid,price,quality);
        double salesTax = Product.calTax();
        double totalSaletax = salesTax*quality;
        System.out.println("Sales Tax for "+pdid+": "+totalSaletax);

    }
}
