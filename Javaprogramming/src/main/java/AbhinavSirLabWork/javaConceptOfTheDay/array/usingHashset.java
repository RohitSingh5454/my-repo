package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class usingHashset {
    public static void main(String[] args) {
        int[] array1={12,2,3,34,45,56,34};
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i:array1){
            if (!hashSet.add(i)){
                System.out.println("Duplicate element is "+i);
            }
        }
        // using java-8
        Set<Integer> set=new HashSet<>();
        Set<Integer> duplicateNo= Arrays.stream(array1).filter(i->!set.add(i)).boxed().collect(Collectors.toSet());
        System.out.println(duplicateNo);

    }
}
