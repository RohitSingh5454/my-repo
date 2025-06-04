package Java8_150Coding.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class mergeTwoUnsortedArray {
    public static void main(String[] args) {
        int[] arr1={1,5,3,7,2};
        int[] arr2={4,8,6,10,9,7};
       int[] sortByAsc= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().distinct().toArray();
        System.out.print(Arrays.toString(sortByAsc)+" ");

    }
}
