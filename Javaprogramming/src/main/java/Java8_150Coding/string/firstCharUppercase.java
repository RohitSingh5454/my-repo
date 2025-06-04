package Java8_150Coding.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class firstCharUppercase {
    public static void main(String[] args) {
        String str="java";
      String str1=  Stream.of(str).map(i->str.substring(0,1).toUpperCase()+str.substring(1)).
              collect(Collectors.joining(""));
        System.out.println(str1);
    }
}
