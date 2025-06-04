package Java8_150Coding.Thirteen13_Jan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekImplementation {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("Sahana","Bhupesh","Roshan","Priyaranjan","Prakash","Himanshu");
        strings.stream().filter(i->i.length()>6).peek(c-> System.out.println("filter Element is "+c)).
                map(String::toUpperCase).peek(p-> System.out.println("Mapped name "+p)).toArray();

    }
}
