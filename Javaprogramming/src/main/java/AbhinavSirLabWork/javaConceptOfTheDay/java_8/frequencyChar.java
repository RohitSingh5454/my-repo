package AbhinavSirLabWork.javaConceptOfTheDay.java_8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyChar {
    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";
        String inputStr=inputString.replaceAll(" ","");
        Map<Character,Long> freqChar=inputString.chars().mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(freqChar);
    }
}
