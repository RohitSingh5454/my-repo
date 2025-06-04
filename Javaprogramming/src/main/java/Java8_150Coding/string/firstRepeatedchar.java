package Java8_150Coding.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstRepeatedchar {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
      Map<Character,Long> countChar= inputString.chars().mapToObj(i->(char)i).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
           Character countFirstchar=   countChar.entrySet().stream().filter(i->i.getValue()>1).map(entry->entry.getKey()).findFirst().get();
        System.out.println(countFirstchar);
        // first non repeated
       Character countNonRepeatingChar= countChar.entrySet().stream().filter(i->i.getValue()==1).
               map(entry->entry.getKey()).findFirst().get();

        System.out.println(countNonRepeatingChar);
    }
}
