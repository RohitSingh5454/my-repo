package Java8_150Coding;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str="Hello world";
       Map<Character, Long> count= str.chars().mapToObj(i->(char)i).collect(Collectors.
               groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()));
        System.out.println(count);
        Optional<Character> firstNonRepeat=count.entrySet().stream().filter(i->i.getValue()==1).map(e->e.getKey()).findFirst();
        if (firstNonRepeat.isPresent()){
            System.out.println("first non repeating character "+firstNonRepeat.get());
        }
        Optional<Character> firstRepeat=count.entrySet().stream().filter(i->i.getValue()>1).map(i->i.getKey()).findFirst();
        if (firstRepeat.isPresent()){
            System.out.println("first repeat character "+firstRepeat.get());
        }
    }
}
