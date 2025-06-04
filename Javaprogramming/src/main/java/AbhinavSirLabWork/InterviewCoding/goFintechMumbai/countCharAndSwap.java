package AbhinavSirLabWork.InterviewCoding.goFintechMumbai;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countCharAndSwap {
    public static void main(String[] args) {
        String str="Java is programming language";
        Map<Character,Long> countChar=str.chars().mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countChar);
        int a=12;
        int b=21;
        a=a+b;//a==33
        b=a-b;//b==12
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
