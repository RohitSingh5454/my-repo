package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countSentence {
    public static void main(String[] args) {
        String str="Bangalore bangalore goa Goa";
        Map<String,Long> countSentence=Arrays.stream(str.split(" ")).map(String::toLowerCase).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countSentence);
    }
}
