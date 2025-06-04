package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyChars {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        Map<Character,Long> countChars=inputString.chars().mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countChars);
    }
}
