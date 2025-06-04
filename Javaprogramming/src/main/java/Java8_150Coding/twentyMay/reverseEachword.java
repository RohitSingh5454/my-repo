package Java8_150Coding.twentyMay;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class reverseEachword{
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
       String reverse= Arrays.stream(str.split(" ")).map(word->new StringBuilder(word).reverse()).
                collect(Collectors.joining(" "));
        System.out.println(reverse);
    }
}
