package Java8_150Coding;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(76);
        list.add(25);
        list.add(54);
        list.forEach(i-> System.out.println(i));
        System.out.println("__________________");
        list.forEach(i->{
            if (i%2==0)
                System.out.println(i);
        });
    }
}
