package Java8_150Coding;

import java.util.Arrays;
import java.util.List;

public class CompareString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Raghav","Manoj","Samantha","Vire");
        list.stream().sorted((String i,String k)->i.length()-k.length()).forEach(System.out::println);
    }
}
