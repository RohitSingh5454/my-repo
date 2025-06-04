package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenOdd {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList( 1,3,5,4,8,9,14);
        List<Integer> oddList=integerList.stream().filter(i->i%2==1).collect(Collectors.toList());
        System.out.println(oddList);
        List<Integer> evenList=integerList.stream().filter(i->i%2!=1).collect(Collectors.toList());
        System.out.println(evenList);
    }
}
