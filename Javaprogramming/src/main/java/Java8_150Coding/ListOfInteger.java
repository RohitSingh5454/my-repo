package Java8_150Coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListOfInteger {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,11,21,11,10,45,19,87);
       /* List<String> total=list.stream().map(i->i+" ").filter(i->i.startsWith("1")).collect(Collectors.toList());
        System.out.println(total);
       List<Integer> list1=list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);*/
        Set<Integer> set1=new HashSet<>();

        Set<Integer> integerSet=list.stream().filter(i->!set1.add(i)).collect(Collectors.toSet());
        System.out.println("Duplicate element is "+integerSet);

    }
}
