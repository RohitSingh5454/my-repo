package AbhinavSirLabWork.javaConceptOfTheDay.java_8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class sumDIgit {
    public static void main(String[] args) {
        int i = 15623;
        Integer sum= Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);
        Integer sum1=Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum1);
    }
}
