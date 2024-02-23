package GenTask.Task5;
//1.Write a program using map()method,to convert a list of string into uppercase.
//If the given List is stream names= Stream.of("aBc","d","ef")

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Uppcase {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc","d","ef");
        List<String> Uppercase = names.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(Uppercase);
    }
}
