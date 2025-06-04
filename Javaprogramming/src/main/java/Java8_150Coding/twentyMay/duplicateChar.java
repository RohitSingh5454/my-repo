package Java8_150Coding.twentyMay;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicateChar {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        Map<Character,Long> countChar=inputString.chars().mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countChar);
    }
}
