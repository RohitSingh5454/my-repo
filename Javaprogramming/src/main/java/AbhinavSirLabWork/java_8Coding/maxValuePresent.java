package AbhinavSirLabWork.java_8Coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class maxValuePresent {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,23,44,26,98,76,59,39);
        List<Integer> max=list.stream().sorted(Comparator.comparing(Integer::intValue)).limit(1).collect(Collectors.toList());
        System.out.println(max);
        List<Integer> list1=list.stream().sorted(Comparator.reverseOrder()).limit(1).collect(Collectors.toList());
        System.out.println(list1);
    }
}
