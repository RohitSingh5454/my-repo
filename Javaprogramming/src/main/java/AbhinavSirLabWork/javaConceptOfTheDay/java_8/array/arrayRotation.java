package AbhinavSirLabWork.javaConceptOfTheDay.java_8.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class arrayRotation {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7};
       List<Integer> list= Arrays.stream(array).boxed().collect(Collectors.toList());
//        Collections.rotate(list,-2);
//        System.out.println(list);
        // left rotation
        List<Integer> leftRotate= Stream.concat(list.subList(2,list.size()).stream(),list.subList(0,2).stream())
                .collect(Collectors.toList());
        System.out.println(leftRotate);
        // right rotation
        List<Integer> rightRotate=Stream.concat(list.subList(list.size()-2, list.size()).stream(),list.subList(0,list.size()-2).
                        stream())
                .collect(Collectors.toList());
        System.out.println(rightRotate);
    }
}
