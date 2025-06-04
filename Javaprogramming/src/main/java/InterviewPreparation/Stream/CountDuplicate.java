package InterviewPreparation.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicate
{
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("A","B","C","D","E","D","A");
        Map<String,Long> countChar=stringList.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
        System.out.println(countChar);
    }
}
