package AbhinavSirLabWork.javaConceptOfTheDay.java_8.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class printMultiple5 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> multiple5=listOfIntegers.stream().filter(i->i%5==0).collect(Collectors.toList());
        System.out.println(multiple5);
    }
}
