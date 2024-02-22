package GenTask.Task4;
//4.Create a HashMap where keys are student names(strings) and values are their corresponding grades(integer).
//create methods to add a new student,remove a student ,and display up a student's grade by name.

import java.util.HashMap;

class StudentGrades{
    private HashMap<String ,Integer> studentGrades;
    // Constructor to initialize the HashMap
    public StudentGrades(){
        studentGrades = new HashMap<>();
    }
    // Method to add a new student
    public void addStudent(String name,int grade){
        studentGrades.put(name,grade);
        System.out.println("Added student "+ name+ " with grade "+grade+".");
    }

// Method to remove a student
public void removeStudent(String name){
    if(studentGrades.containsKey(name)){
        studentGrades.remove(name);
        System.out.println(" Remove Student : "+name+ ".");
    }else {
        System.out.println(" Student "+name+" not found ");
    }

}
// Method to display a student's grade by name
    public void displayGradebyName(String name){
        if(studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Grade of student " + name + " is " + grade + ".");
        }else{
            System.out.println("student "+name+" not found");
        }
    }
}
public class StudentG {
    public static void main(String[] args) {
        // Create an instance of StudentGrades
        StudentGrades studentGrades = new StudentGrades();

        // Add some students and their grades
        studentGrades.addStudent("Saranya",90);
        studentGrades.addStudent("sudha",95);
        studentGrades.addStudent("Sarvesh",87);
        studentGrades.addStudent("Harish",70);

        // Display grade of a student
        studentGrades.displayGradebyName("Saranya");
        // Remove a student
        studentGrades.removeStudent("Sarvesh");
        // Try to display grade of the removed student
        studentGrades.displayGradebyName("Sarvesh");
    }

}
