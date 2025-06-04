package Java8_150Coding.twentyMay;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secondLargest {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89,89);
       int num= listOfIntegers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(num);
    }
}
