package Java8_150Coding.twentyMay;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class threeMaxMin {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> max3=listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).
                collect(Collectors.toList());

        // min 3
        List<Integer> min3=listOfIntegers.stream().sorted(Comparator.naturalOrder()).limit(3).
                collect(Collectors.toList());
        System.out.println("maximum 3 number "+max3);
        System.out.println("minimum 3 number "+min3);
    }
}
