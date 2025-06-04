package InterviewPreparation;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MaxMinNumber {
    public static void main(String[] args) {
        Integer i= Stream.of(1,4,6,34,1,22,45,66,38).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("max number is "+i);
        Integer x=Stream.of(23,44,12,67,28,95,38,55).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("min no is "+x);
    }
}
