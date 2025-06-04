package Java8_150Coding;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class arrayElementSum {
    public static void main(String[] args) {
        int[] arr1={1,3,5,6,7};
        int sum=0;
        for (int i=0;i<arr1.length;i++){
            sum=sum+arr1[i];
        }
        int sum2= IntStream.of(arr1).sum();
        System.out.println(sum);
        System.out.println(sum2);
    }
}
