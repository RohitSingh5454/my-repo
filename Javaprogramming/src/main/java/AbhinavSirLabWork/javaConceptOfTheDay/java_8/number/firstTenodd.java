package AbhinavSirLabWork.javaConceptOfTheDay.java_8.number;

import java.util.stream.IntStream;

public class firstTenodd {
    public static void main(String[] args) {
       boolean number= IntStream.rangeClosed(1,11).noneMatch(i->i%2!=0);
        System.out.println(number);
        IntStream.rangeClosed(1,21).filter(i->i%2!=0).forEach(System.out::println);
    }
}
