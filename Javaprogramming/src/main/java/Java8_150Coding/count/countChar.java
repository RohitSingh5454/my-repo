package Java8_150Coding.count;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countChar {
    public static void main(String[] args) {
        String str="Java concept of the day";
        String str1=str.replaceAll("\s++","");
        System.out.println(str1);
        Map<Character,Long> countChar=str1.chars().mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countChar);
    }
}
