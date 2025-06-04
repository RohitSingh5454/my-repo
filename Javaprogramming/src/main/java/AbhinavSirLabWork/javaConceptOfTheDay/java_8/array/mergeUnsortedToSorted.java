package AbhinavSirLabWork.javaConceptOfTheDay.java_8.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class mergeUnsortedToSorted {
    public static void main(String[] args) {
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5,4};
        int[] c=IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }
}
