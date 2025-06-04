package AbhinavSirLabWork;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurenceString {
    public static void main(String[] args) {
        String str="A is a man in bangalore";
        Map<Character,Long> map=str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting()));

       // Map<String,Long> map=list.mapToObj(i->i).collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(map);
    }
}
