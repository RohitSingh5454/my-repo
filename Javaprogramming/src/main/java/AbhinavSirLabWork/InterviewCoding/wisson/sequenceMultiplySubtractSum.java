package AbhinavSirLabWork.InterviewCoding.wisson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sequenceMultiplySubtractSum {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       List<Integer> get= list.stream().map(i->i*5-2).collect(Collectors.toList());
        System.out.println(get);
       int result= list.stream().map(i->i*5-2).collect(Collectors.summingInt(Integer::intValue));
        System.out.println(result);
    }
}
