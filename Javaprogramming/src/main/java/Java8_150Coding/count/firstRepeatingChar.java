package Java8_150Coding.count;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstRepeatingChar {
    public static void main(String[] args) {
        String str="Java concept of the day";
        String firstRepeatingChar=str.chars().mapToObj(i->(char) i).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()>1).findFirst().get().toString();
        System.out.println(firstRepeatingChar);
    }
}
