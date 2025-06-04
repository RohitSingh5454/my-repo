package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class joinStrings {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Facebook","Twitter","YouTube","WhatsApp", "LinkedIn");
       String joined= listOfStrings.stream().collect(Collectors.joining(","+"how","[","]"));
        System.out.println(listOfStrings);
        System.out.println(joined);
    }
}
