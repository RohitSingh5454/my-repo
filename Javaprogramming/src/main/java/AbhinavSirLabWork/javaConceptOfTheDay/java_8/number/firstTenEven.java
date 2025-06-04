package AbhinavSirLabWork.javaConceptOfTheDay.java_8.number;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class firstTenEven {
    public static void main(String[] args) {
        IntStream.range(1,10).map(i->i*2).forEach(System.out::println);
    }
}
