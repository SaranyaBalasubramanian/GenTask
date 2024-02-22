package GenTask.Task4;
//1.Ramesh is developing a student management system for a university.
// In this system,you have a student class to represent student information.
// You are asked to help ramesh to handle exception which can be occurred into program according to following scenarios:
//a.Class student with attributes roll,name,age and course.Initialize value through parameterized constructor.
//        b.If the age of the student is not between 15 and 21 then generate a user-defined exception "AgeNotWithinRageException".
//        c.If a name contains number or special symbols,raise exception "NameNotValidException".Define the two exception classes.
import java.util.SortedMap;

class AgeNotWithinRageException extends Exception{
    public AgeNotWithinRageException (String message){
        super(message);
    }
}
class NameNotValidException extends Exception{
    public NameNotValidException (String message){
        super(message);
    }
}
class Student{
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRageException,NameNotValidException{
    this.rollNo = rollNo;
    if(age<15 || age>21){
        throw new AgeNotWithinRageException("Age should be between 15 to 21");
    }this.age = age;
    if(!name.matches("[a-z A-Z]+")){
        throw new NameNotValidException("Name should only contain alphabet and spaces");
    }
    this.name = name;

    this.course = course;

}
}

public class StudentManagement {
    public static void main(String[] args) {
        try {
            //vaild name
            Student s1 =new Student(1,"Saranya Sudhakaran",18,"Computer Science");
            System.out.println("Student created Successfully");
            //Invalid name
            Student s2 = new Student(2,"1@Sudha",18,"Mechanical");
            //Invalid Age
            Student s3 = new Student(3,"Sudha",24,"Civil");
        }
        catch (AgeNotWithinRageException e){
            System.out.println("Error:"+e.getMessage());
        }
        catch(NameNotValidException e){
            System.out.println("Error:"+e.getMessage());
        }
    }
}

