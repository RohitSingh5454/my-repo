package Java8_150Coding.twentyMay;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class mostRepeated {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String,Long> map=listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
        Map.Entry mostRepeated=map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(mostRepeated.getKey());
        System.out.println(mostRepeated.getValue());
    }
}
