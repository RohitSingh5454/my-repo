package Java8_150Coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamVsParallelStream {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Roshan","Sachin","Vivek","Manohar","Lokesh");
      List l1=  list.stream().filter((e)->list.size()>4).skip(4).collect(Collectors.toList());
        System.out.println(l1);
        // parallel execution
        list.parallelStream().filter(e->list.size()>4).skip(3).collect(Collectors.toList()).forEach(System.out::println);
        Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return o1.compareTo(o2);
            }
        };
        Runnable r1=()-> System.out.println("This is runnable interface");
    }
}
