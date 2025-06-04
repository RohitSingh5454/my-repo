package Java8_150Coding.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class threeMax_Min {
    public static void main(String[] args) {
        int[] arr1={1,5,3,7,2};
        int[] arr2={4,8,6,10,9,7};
        // max 3
      List<Integer> max3= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).boxed().
                sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.print(max3+" ");
        // min 3
      List<Integer> min3=  IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).boxed().
                sorted().limit(3).collect(Collectors.toList());
        System.out.print(min3+" ");

    }
}
