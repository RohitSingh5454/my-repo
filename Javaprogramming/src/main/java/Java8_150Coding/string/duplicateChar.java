package Java8_150Coding.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicateChar {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day";
        String removeSpace=inputString.replaceAll("\s++","").toLowerCase();
        HashSet<String> chars=new HashSet<>();
        System.out.println(removeSpace);
       Set<String> duplicateChars= Arrays.stream(removeSpace.split("")).
               filter(i->!chars.add(i)).collect(Collectors.toSet());
        System.out.println(duplicateChars);
    }
}
