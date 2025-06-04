package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 1, 3, 4, 5, 4, 6, 7,3,3,4};
        System.out.println("-------");
        // consecutive duplicates
        List<Integer> list1= IntStream.rangeClosed(0,array1.length-2).filter(i->array1[i]==array1[i+1])
                .mapToObj(i->array1[i]).collect(Collectors.toList());
        System.out.println(list1);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            if (set.contains(array1[i])) {
                set.remove(array1[i]);
            }
            set.add(array1[i]);
        }
        System.out.println(set);
        // using distinct
        List<Integer> removeDuplicate = Arrays.stream(array1).boxed().distinct().collect(Collectors.toList());
        System.out.println("-------");
        System.out.println(removeDuplicate);
        int[] remove= Arrays.stream(array1).filter(i->!set.remove(i)).toArray();
        System.out.println(Arrays.toString(remove));
    }
}
