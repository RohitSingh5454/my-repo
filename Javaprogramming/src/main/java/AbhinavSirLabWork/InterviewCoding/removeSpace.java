package AbhinavSirLabWork.InterviewCoding;

import HowToDoInJava8.Stream.Array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class removeSpace {
    public static void main(String[] args) {
        String str="Java concept of the day";
        String str1=str.replaceAll("\s++","");
        System.out.println(str1);
        // find occurence
        Map<String,Long> count=Arrays.stream(str1.split(" ")).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(count);
        // find occurence of each character
        Map<Character,Long> countCharacter= str1
                .toLowerCase().chars().mapToObj(c->(char) c).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countCharacter);
        // find first repeating character
        String firstRepeatingchar= str1.chars().mapToObj(i->(char) i).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).
                entrySet().stream().filter(i->i.getValue()>1).findFirst().get().toString();
        System.out.println(firstRepeatingchar);

        // last repeating character
        String lastRepeating=str.chars().mapToObj(i->(char) i).
                collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).
                entrySet().stream().filter(i->i.getValue()>1).reduce((first,last)->last).get().toString();
        System.out.println(lastRepeating);
    }
}
