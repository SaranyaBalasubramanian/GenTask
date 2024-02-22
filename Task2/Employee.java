package GenTask.Task2;
//Define a base class Person with attributes name and age.
//Create a subclass employee that inherits from person and adds attributes like employeeID and salary.
//Use the super keyword t initialize the person attributes in the employee constructor.
class person{
 protected String name;
 protected int age;

    // Constructor to initialize name and age
    public person(String name,int age){
        this.name = name;
        this.age = age;
    }
    //method to display details
    public void personDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age :"+age);
    }
}

class employee extends person{
    private int employeeID;
    private double salary;

    // Constructor to initialize name, age, employeeID, and salary
public employee(String name,int age, int employeeID,double salary){
    super(name, age);// Call the base class constructor to initialize name and age
    this.employeeID = employeeID;
    this.salary = salary;
}
    // Method to display employee details
    public void displayEmployeeDetails(){
        System.out.println("EmployeeID:"+employeeID);
        super.personDetails();
        System.out.println("Salary :"+salary);
    }
}
public class Employee {
    public static void main(String[] args) {
        employee emp = new employee("Saran",25,101,25000);
        // Display employee details
        emp.displayEmployeeDetails();

    }
}
