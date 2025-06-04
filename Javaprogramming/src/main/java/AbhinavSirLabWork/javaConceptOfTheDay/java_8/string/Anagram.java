package AbhinavSirLabWork.javaConceptOfTheDay.java_8.string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        s1=Stream.of(s1.split("")).sorted().map(String::toUpperCase).collect(Collectors.joining());
        s2=Stream.of(s2.split("")).sorted().map(String::toUpperCase).collect(Collectors.joining());
        if (s1.equals(s2)){
            System.out.println("These two strings are anagram");
        }
        else {
            System.out.println("These two strings are not anagram");
        }
    }
}
