package Java8_150Coding.twentyMay;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sumOfDigits {
    public static void main(String[] args) {
        int num=123;
        int sum= Stream.of(String.valueOf(num).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);
    }
}
