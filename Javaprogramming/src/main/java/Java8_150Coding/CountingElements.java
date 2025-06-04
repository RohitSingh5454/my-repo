package Java8_150Coding;

import HowToDoInJava8.Stream.Array;

import java.util.Arrays;
import java.util.List;

public class CountingElements {
    public static void main(String[] args) {
        Long count= Arrays.stream(new int[] {1,2,3,4,5,6,7,8,11,22,33}).count();
        System.out.println(count);
        List<String> list= Arrays.asList("Somnath","Shikhar","Manohar","Suresh","Saksham");
        Long countString =list.stream().filter(i->i.length()>6).count();
        System.out.println(countString);
    }
}
