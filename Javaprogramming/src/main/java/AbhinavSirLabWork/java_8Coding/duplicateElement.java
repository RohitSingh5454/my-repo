package AbhinavSirLabWork.java_8Coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicateElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,23,12,45,67,23,56,77,98);
        Set<Integer> set=new HashSet<>();
        list.stream().filter(i->!set.add(i)).collect(Collectors.toList()).forEach(System.out::println);

    }
}
