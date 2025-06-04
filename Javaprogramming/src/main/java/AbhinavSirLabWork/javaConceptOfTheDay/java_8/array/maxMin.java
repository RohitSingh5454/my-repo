package AbhinavSirLabWork.javaConceptOfTheDay.java_8.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maxMin {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max element is " + max);
        System.out.println("min element is " + listOfIntegers.stream().min(Comparator.naturalOrder()).get());
    }
}
