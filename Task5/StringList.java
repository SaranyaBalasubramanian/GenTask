package GenTask.Task5;

import java.util.Arrays;
import java.util.List;

//2.Write a program to check whether the string in the list are empty or not and print the list having non-empty strings.
//If the given List is:Liststrings = Arrays.asList("abc","","bc","efg","adbc","","jkl");
public class StringList {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc","","bc","efg","adbc","","jkl");
        System.out.println("Original List: "+strings);
        List<String> nonEmptyStrings = strings.stream().filter(s -> !s.isEmpty()).toList();
        System.out.println("List with non empty string: "+ nonEmptyStrings );
    }
}
