package AbhinavSirLabWork.Class;

import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class before {
    public static void main(String[] args) {
        String str="Java concept of the day";
        String str1=str.replaceAll(" ","");

        Map<Character, Long> occurence=str1.chars().mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(occurence);
        int a=23;
        int b=12;
        a=a+b;// 35
        b=a-b;// 23
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
}
