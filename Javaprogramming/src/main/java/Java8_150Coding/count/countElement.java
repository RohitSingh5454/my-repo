package Java8_150Coding.count;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countElement {
    public static void main(String[] args) {
        int[] arr1={1,2,4,5,2,6,3,1,2};
        List<Integer> list=Arrays.asList(1,2,3,2,4,5,6,1,7);
       Map<Integer,Long> countElement= Arrays.stream(arr1).boxed().
               collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countElement);
        //list count
        Map<Integer,Long> countElement2=list.stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countElement2);
    }
}
