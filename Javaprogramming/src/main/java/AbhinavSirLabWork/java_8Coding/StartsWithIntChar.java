package AbhinavSirLabWork.java_8Coding;

import java.util.Arrays;
import java.util.List;

public class StartsWithIntChar {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(11,34,56,78,15,18,66);
        list.stream().map(str->str+" ").filter(i->i.startsWith("1")).forEach(System.out::println);
    }
}
