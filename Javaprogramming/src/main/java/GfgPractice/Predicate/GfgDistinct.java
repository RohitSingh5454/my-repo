package GfgPractice.Predicate;

import java.util.Arrays;
import java.util.List;

public class GfgDistinct {
    public static void main(String[] args) {
        List<Integer> l2= Arrays.asList(23,11,43,11,43,67,89,34);
        DistinctList(l2);
    }
    public static void DistinctList(List<Integer> l2){
        l2.stream().sorted().distinct().forEach(i->{
            System.out.print(i+" ");
        });
    }
}
