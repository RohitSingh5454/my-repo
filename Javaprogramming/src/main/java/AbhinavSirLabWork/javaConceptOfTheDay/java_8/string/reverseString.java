package AbhinavSirLabWork.javaConceptOfTheDay.java_8.string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class reverseString {
    public static void main(String[] args) {
        String str="Welcome to the world";
        String string=Stream.of(str).map(i->new StringBuilder(i).reverse()).collect(Collectors.joining(""));
        System.out.println(string);
    }
}
