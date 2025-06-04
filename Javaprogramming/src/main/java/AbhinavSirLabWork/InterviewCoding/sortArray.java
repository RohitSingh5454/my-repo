package AbhinavSirLabWork.InterviewCoding;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sortArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 45, 67, 7};
        int[] arr2 = {34, 12, 62, 46};
        int[] arr3 = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] > arr2[j]) {
                    arr3[i] = arr2[j];
                     arr3[j]=arr1[i];
                }
            }

        }
      // IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().forEach(System.out::println);
       // System.out.println(Arrays.toString(arr3));
    }}
