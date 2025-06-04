package Java8_150Coding.string;

import java.util.Arrays;
import java.util.Comparator;

public class longestEvenString {
    public static void main(String[] args) {
        String str="java is popular programmin language";
        String longestEven=Arrays.stream(str.split(" ")).filter(i->i.length()%2==0)
                .max(Comparator.comparingInt(String::length)).get();
        System.out.println(longestEven);
    }
}
