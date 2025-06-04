package Java8_150Coding.array;

import java.util.Arrays;
import java.util.Comparator;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr1={12,23,34,32,54,54,67,67,45};
       int secondMax= Arrays.stream(arr1).boxed().sorted(Comparator.reverseOrder()).
                skip(1).findFirst().orElse(null);
        System.out.println(secondMax);

    }
}
