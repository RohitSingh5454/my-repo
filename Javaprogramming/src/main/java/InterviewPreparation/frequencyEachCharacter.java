package InterviewPreparation;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyEachCharacter {
    public static void main(String[] args) {
        String str="abcadefbcbgk";
        Map<Character,Long> freq=str.chars().mapToObj(x->(char) x).collect
                (Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(freq);

    }
}
