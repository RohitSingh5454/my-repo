package InterviewPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicate {
    public static void main(String[] args) {
        List<Integer> lis= Arrays.asList(1,2,3,4,5,1,2,3,6,7,2,7);
        Map<Integer,Long> map1=lis.stream().collect(Collectors.toMap(Function.identity(),i->1L,Long::sum));
        System.out.println(map1);
        Map<Integer,Long> map2=lis.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(map2);
    }
}
