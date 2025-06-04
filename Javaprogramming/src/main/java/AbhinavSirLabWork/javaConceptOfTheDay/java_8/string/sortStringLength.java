package AbhinavSirLabWork.javaConceptOfTheDay.java_8.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortStringLength {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted(Comparator.comparing(String::length).reversed()).
                collect(Collectors.toList()).forEach(System.out::println);
    }
}
