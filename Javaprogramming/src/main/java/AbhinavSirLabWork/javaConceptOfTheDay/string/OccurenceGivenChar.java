package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceGivenChar {
    public static void main(String[] args) {
        String str="Javacha";
        char[] array=str.toCharArray();
        char ch='a';
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println("no of times char a present is "+count);
        // using java-8
        Map<Character,Long> countSpecific= str.chars().mapToObj(i->(char)i).filter(i->i.equals(ch))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countSpecific);
        int countChar=str.length()-str.replace("a","").length();
        System.out.println(countChar);
    }
}
