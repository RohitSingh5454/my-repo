package AbhinavSirLabWork.java_8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenOdd {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,24,33,55,78,34);
        List<Integer> even=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("Even list are "+even);
        List<Integer> odd=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println("Odd list are "+odd);
    }
}
