package Java8_150Coding.sum;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class digits {
    public static void main(String[] args) {
        int a=1234;
        String str=String.valueOf(a);
      int sum=  Stream.of(str.split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);
    }
}
