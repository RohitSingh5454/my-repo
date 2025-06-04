package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstNonRepeated {
    public static void main(String[] args) {
         String str="Java concept of the day";
         String str1=str.replaceAll(" ","");
        Character result=str1.chars().mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet()
                .stream().filter(i->i.getValue()==1).map(i->i.getKey()).findFirst().get();
        System.out.println(result);
    }
}
