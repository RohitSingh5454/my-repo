package AbhinavSirLabWork.InterviewCoding.PatchInfotech;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacter {
    public static void main(String[] args) {
        String str="Interview";
        Map<Character,Long> countChar=str.toLowerCase().chars().mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countChar);
    }
}
