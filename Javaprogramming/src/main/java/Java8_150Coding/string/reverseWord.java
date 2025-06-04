package Java8_150Coding.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseWord {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
      String strReverse=  Arrays.stream(str.split(" ")).map(word->new StringBuffer(word).reverse()).
              collect(Collectors.joining(" "));
        System.out.print(strReverse);
    }
}
