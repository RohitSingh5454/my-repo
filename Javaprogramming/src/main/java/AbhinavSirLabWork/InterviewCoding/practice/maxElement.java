package AbhinavSirLabWork.InterviewCoding.practice;

import HowToDoInJava8.Stream.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class maxElement {
    public static void main(String[] args) {
        int[] arr1={12,43,13,56,32,75,34,86,58,73};
       int max= Arrays.stream(arr1).boxed().min(Comparator.naturalOrder()).get();
        System.out.println(max);
    }
}
