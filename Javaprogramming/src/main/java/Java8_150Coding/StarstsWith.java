package Java8_150Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StarstsWith {
    public static void main(String[] args) {
        String str="A man is a agandu. alag hi Achutiya hai";

        List<String> list= Arrays.asList(str.split("\\s+"));
        List<String> list1=list.stream().filter(i->i.toLowerCase().startsWith("a")).collect(Collectors.toList());
        System.out.println(list1);
    }
}
