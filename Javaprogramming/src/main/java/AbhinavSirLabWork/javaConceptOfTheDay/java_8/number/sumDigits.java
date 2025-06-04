package AbhinavSirLabWork.javaConceptOfTheDay.java_8.number;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sumDigits {
    public static void main(String[] args) {
        int num=345;
        int sum=Stream.of(String.valueOf(num).split(""))
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);
    }
}
