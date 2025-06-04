package LeetCodePractice.problemSolving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sumEven {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        int sum=list.stream().filter(i->i%2==0).collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
    }
}
