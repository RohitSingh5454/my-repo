package Java8_150Coding.count;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joiningList {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println(listOfStrings);
       String joined= listOfStrings.stream().collect(Collectors.joining(" ,","[","]"));
        System.out.println(joined);

    }
}
