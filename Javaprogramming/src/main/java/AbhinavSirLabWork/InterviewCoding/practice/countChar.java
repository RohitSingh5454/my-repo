package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countChar {
    public static void main(String[] args) {
        String str="java concept of the day";
        String str1=str.replaceAll(" ","");
        Map<Character,Long> countChar=str1.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countChar);
    }
}
