package AbhinavSirLabWork.javaConceptOfTheDay.java_8.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class reverseArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] reverseArray= IntStream.rangeClosed(0,array.length-1).map(i->array[array.length-i-1]).toArray();
        System.out.println(Arrays.toString(reverseArray));
    }
}
