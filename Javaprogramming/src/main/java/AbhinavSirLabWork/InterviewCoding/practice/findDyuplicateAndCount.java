package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findDyuplicateAndCount {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
       Map<String,Long> mapString=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       Map<String,Long> mapData=mapString.entrySet().stream().filter(i->i.getValue()>1).
               collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(mapData);

    }
}
