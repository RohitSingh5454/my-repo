package Java8_150Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> stream=list.stream();
        stream.forEach(System.out::println);
        stream.forEach(System.out::println);
    }
}
