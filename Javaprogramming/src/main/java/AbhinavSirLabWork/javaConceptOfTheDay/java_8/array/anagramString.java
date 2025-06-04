package AbhinavSirLabWork.javaConceptOfTheDay.java_8.array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class anagramString {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        s1= Arrays.stream(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        s2=Arrays.stream(s2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        if (s1.equals(s2)){
            System.out.println("Two strings are anagram");
        }
        else {
            System.out.println("Two strings are not anagram");
        }
    }
}
