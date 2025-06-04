package InterviewPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayCountElem {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,3,4,2,4,6,7);
        Map<Integer,Long> m1=l1.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(m1);
    }
}
