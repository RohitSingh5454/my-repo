package AbhinavSirLabWork.javaConceptOfTheDay.java_8;

import java.util.stream.IntStream;

public class firstTenEven {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).map(i->i*2).forEach(System.out::println);
    }
}
