package GfgPractice.Predicate;

import java.util.Arrays;
import java.util.List;

public class GfgSorted {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(12,34,11,87,21,43,97);
        ListSorted(list1);
    }
    public static void ListSorted(List<Integer> list1){
        list1.stream().sorted().forEach(i->{
            System.out.println(i);
        });
    }
}
