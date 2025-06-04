package AbhinavSirLabWork.javaConceptOfTheDay.java_8.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class threeMinAndMax {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> min3 = listOfIntegers.stream().sorted(Comparator.naturalOrder()).limit(3).
                collect(Collectors.toList());
        System.out.println(min3);
        List<Integer> max3 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).
                collect(Collectors.toList());
        System.out.println(max3);
    }
}
