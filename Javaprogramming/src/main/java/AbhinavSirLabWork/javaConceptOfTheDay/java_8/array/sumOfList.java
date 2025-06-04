package AbhinavSirLabWork.javaConceptOfTheDay.java_8.array;
import java.util.*;

public class sumOfList {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);
       int sum= array.stream().reduce(0,(element1,element2)->element1+element2);
        System.out.println(sum);
    }
}
