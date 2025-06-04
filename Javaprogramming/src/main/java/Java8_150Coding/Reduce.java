package Java8_150Coding;

import java.util.Arrays;
import java.util.OptionalInt;

public class Reduce {
    public static void main(String[] args) {
        OptionalInt sum= Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9}).reduce((a, b)->a+b);
        System.out.println(sum);

    }
}
