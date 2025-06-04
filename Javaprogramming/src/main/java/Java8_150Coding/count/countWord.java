package Java8_150Coding.count;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countWord {
    public static void main(String[] args) {
        String str="Bangalore bangalore goa Goa";
        String lowerCase=str.toLowerCase();
        Map<String,Long> countWord=Arrays.stream(lowerCase.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countWord);
    }
}
