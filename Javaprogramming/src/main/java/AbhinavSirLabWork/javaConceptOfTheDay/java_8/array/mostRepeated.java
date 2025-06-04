package AbhinavSirLabWork.javaConceptOfTheDay.java_8.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class mostRepeated {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
       Map<String,Long> count=listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       Map.Entry<String,Long> mostRepeated= count.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(mostRepeated);
    }
}
