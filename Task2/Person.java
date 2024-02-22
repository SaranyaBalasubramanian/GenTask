package GenTask.Task2;
//1.Create a class Person with properties with properties(name and age) with following features.
//a.Default age of person should be 18;
//b.A person object can be to initialize with name and age;
//c.Method to display name and age of person
public class Person {
    private String name;
    private int age;
    //default constructor
    public  Person(){
        this.age = 18;
    }
    //constructor to initialize
    public  Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void displayDetails(){
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Saranya");
        person1.displayDetails();
    }
}
