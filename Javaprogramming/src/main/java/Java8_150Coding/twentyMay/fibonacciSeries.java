package Java8_150Coding.twentyMay;

import java.util.stream.Stream;

public class fibonacciSeries {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]}).limit(10).map(i->i[0])

                .forEach(System.out::println);
    }
}
