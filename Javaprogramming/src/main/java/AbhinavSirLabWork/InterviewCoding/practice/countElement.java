package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class countElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,14,4,6,9,8);
        Long count=list.stream().count();
        System.out.println(count);
        // max value
       Integer max= list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
    }
}
