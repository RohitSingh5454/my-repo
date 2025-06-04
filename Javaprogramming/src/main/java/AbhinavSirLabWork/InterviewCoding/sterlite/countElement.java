package AbhinavSirLabWork.InterviewCoding.sterlite;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countElement {
    public static void main(String[] args) {
        int[] a={1,2,2,3,4,4,5};
        Map<Integer,Long> countElement=Arrays.stream(a).boxed().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countElement);
    }
}

