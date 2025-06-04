package AbhinavSirLabWork.javaConceptOfTheDay.java_8.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstRepeatedChar {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Map<String,Long> count=Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        String firstRepeated=count.entrySet().stream().filter(i->i.getValue()>1).map(i->i.getKey()).findFirst().get();
        System.out.println(firstRepeated);
        // last repeated character
       String lastRepeated= count.entrySet().stream().filter(i->i.getValue()>1).map(i->i.getKey()).reduce((first,second)->second).get();
        System.out.println(lastRepeated);
    }
}
