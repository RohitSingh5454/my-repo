package AbhinavSirLabWork.InterviewCoding.montra;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countSentence {
    public static void main(String[] args) {
        String str="Bangalore bangalore goa Goa";
       Map<String,Long> countSen= Arrays.stream(str.toLowerCase().split(" "))
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countSen);
    }
}
