package InterviewPreparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class mergeTwoUnsortedArray {
    public static void main(String[] args) {
        int[] in1=new int[]{4,8,3,2};
        int[] in2=new int[]{9,6,12,65};
        int[] c= IntStream.concat(Arrays.stream(in1),Arrays.stream(in2)).sorted().toArray();
        System.out.println(Arrays.toString(c));
        // second largest element in array
        List<Integer> list=Arrays.asList(34,54,67,89,89,43,21,67);
        Integer secondLargest=list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(secondLargest);
    }
}
