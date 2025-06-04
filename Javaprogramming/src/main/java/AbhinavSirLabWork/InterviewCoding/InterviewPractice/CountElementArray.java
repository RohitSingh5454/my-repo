package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountElementArray {
    public static void main(String[] args) {
        int[] a={1,2,2,3,4,4,5};
        Map<Integer,Long> hm=Arrays.stream(a).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(hm);
    }
}
