package AbhinavSirLabWork;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapUsing {
    public static void main(String[] args) {
        String test="Java";
      Map<Character,Long> map=  test.chars().mapToObj(ch->(char) ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
