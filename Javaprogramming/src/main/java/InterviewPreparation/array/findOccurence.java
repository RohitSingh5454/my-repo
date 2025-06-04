package InterviewPreparation.array;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findOccurence {
    public static void main(String[] args) {
        int[] a1={1,2,3,2,4,5,4};
       Map<Integer, Long> occurence= Arrays.stream(a1).boxed().collect(Collectors.
               groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(occurence);
    }
}
