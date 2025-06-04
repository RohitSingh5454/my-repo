package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class printDuplicateNo {
    public static void main(String[] args) {
        int a[] = { 1, 4, 5, 2, 12, 34, 2, 11 };
        Map<Integer,Long> duplicateNo= Arrays.stream(a).boxed().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        duplicateNo.entrySet().stream().filter(i->i.getValue()>1).map(i->i.getKey()).forEach(System.out::println);
    }
}
