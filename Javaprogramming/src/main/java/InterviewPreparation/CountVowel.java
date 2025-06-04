package InterviewPreparation;

import java.util.Map;
import java.util.stream.Collectors;

public class CountVowel {
    public static void main(String[] args) {
        String str="Hello my name is rohit";
        long count=str.chars().filter(i->{
            return (i=='a' || i=='e' || i=='i' || i=='o' || i=='u');
        }).count();
        System.out.println(count);
        Map<String,Long> stringMap=str.chars().mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Object::toString,Collectors.counting()));
       // System.out.println(stringMap);
        stringMap.forEach((key,value)-> System.out.println("character "+key + " "+"counting "+value));

    }
}
