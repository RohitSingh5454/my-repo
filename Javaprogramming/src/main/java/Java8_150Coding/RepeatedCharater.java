package Java8_150Coding;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedCharater {
    public static void main(String[] args) {
        String str="Hello World";
        Map<Character,Long> count=str.chars().mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(count);

    }
}
