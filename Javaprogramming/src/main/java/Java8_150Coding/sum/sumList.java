package Java8_150Coding.sum;

import java.util.Arrays;
import java.util.List;

public class sumList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        int sumList=list.stream().mapToInt(i->i).sum();
        System.out.println(sumList);
    }
}
