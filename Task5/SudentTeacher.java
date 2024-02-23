package GenTask.Task5;
//3.You are a teacher in school.In your class there are 10 Students,
// You have decided to give special gifts to those student whose names start with "A".
// You are asked to separate those students with the help of a java program.
//Requirement:
//Use List interface to store the student name.
//Use a lambda expression and the Stream API to filter the students.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class SudentTeacher {
    public static void main(String[] args) {
        List<String> Students = Arrays.asList("Aruna","Ambiga","Balu","Sudha","Arjun","Saranya","Anu","Alamu");
        System.out.println("Student List: "+ Students);

        List<String> StudenswithA = Students.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
        System.out.println("Student with A for gifts:" + StudenswithA);
    }
}
