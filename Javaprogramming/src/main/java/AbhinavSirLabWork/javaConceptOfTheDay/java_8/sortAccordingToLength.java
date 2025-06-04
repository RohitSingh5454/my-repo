package AbhinavSirLabWork.javaConceptOfTheDay.java_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortAccordingToLength {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
       List<String> comparingByLength= listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(comparingByLength);
        // in descending order
       List<String> reverseByLength= listOfStrings.stream().sorted((s1,s2)->Integer.compare(s2.length(),s1.length())).collect(Collectors.toList());
        System.out.println(reverseByLength);
    }
}
