package Java8_150Coding.Thirteen13_Jan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitUse {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Raman","Sikhar","Sikhar","Saksham","Priyaranjan","Manohar");
        list.stream().limit(3).distinct().collect(Collectors.toList()).forEach(System.out::println);
    }
}
