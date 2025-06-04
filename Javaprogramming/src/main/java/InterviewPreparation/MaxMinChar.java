package InterviewPreparation;

import java.util.Comparator;
import java.util.stream.Stream;

public class MaxMinChar {
    public static void main(String[] args) {
        String str= Stream.of("A","G","X","Y","K","L").max(Comparator.comparing(String::valueOf)).get();
        System.out.println(str);
    }
}
