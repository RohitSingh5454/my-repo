package InterviewPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCountList {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Anand","Barhan","Anand","Saksham","Barhan","Anand");
        Map<String,Long> map=list.stream().map(String::toString).collect(Collectors.
                groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
