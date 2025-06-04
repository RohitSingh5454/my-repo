package Java8_150Coding.twentyMay;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class startsWithNumber {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
       List<String> startsWithNum= listOfStrings.stream().filter(i->Character.isDigit(i.charAt(0)))
               .collect(Collectors.toList());
        System.out.println(startsWithNum);
    }
}
