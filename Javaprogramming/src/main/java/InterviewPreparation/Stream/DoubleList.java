package InterviewPreparation.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DoubleList {
    public static void main(String[] args) {
        List<Integer> los= Arrays.asList(1,2,3,4,5,6,7);

        List<Integer> lp=los.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(lp);
    }
}
