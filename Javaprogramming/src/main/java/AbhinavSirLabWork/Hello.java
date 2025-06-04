package AbhinavSirLabWork;

import java.util.Arrays;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Hello {
    public static void main(String[] args) {
            List<Integer> list= Arrays.asList(10,15,8,49,25,98,98,32,15,18);
            List<String> startsWith1= list.stream().map(i->i.toString())
                    .filter(j->j.startsWith("1")).distinct().collect(Collectors.toList());
        System.out.println(startsWith1);
        String str="java is a excellent programming language";
        Character nonRepeated=str.chars().mapToObj(i->Character.toLowerCase(Character.valueOf((char)i)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()==1L).map(i->i.getKey()).findFirst().get();
        System.out.println(nonRepeated);
    }
}