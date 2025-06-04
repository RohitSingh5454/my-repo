package AbhinavSirLabWork.javaConceptOfTheDay.java_8;

import java.util.stream.IntStream;

public class sumNatural {
    public static void main(String[] args) {
       IntStream ranges= IntStream.range(1,10);
      int sum= ranges.sum();
        System.out.println(sum);
    }
}
