package InterviewPreparation.Stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> lop= Arrays.asList(1,2,3,4,5,6,7,8);
        int lp=lop.stream().mapToInt(i->i*i).sum();
        System.out.println("sum is "+lp);


    }
}
