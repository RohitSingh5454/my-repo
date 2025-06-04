package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.List;
import java.util.stream.Collectors;

public class SumElements {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,8,23,16);
       int sum= list.stream().filter(k->k%2==1).collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
    }
}
