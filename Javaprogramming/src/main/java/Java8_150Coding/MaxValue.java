package Java8_150Coding;

import java.util.Arrays;
import java.util.List;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,23,11,56,43,66,56,78,34,52);
        int max=list.stream().max(Integer::compare).get();
        System.out.println(max);
    }
}
