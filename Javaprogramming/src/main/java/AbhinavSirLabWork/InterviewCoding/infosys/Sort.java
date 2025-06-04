package AbhinavSirLabWork.InterviewCoding.infosys;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sort {
    public static void main(String[] args) {
        List<String> name=new ArrayList<>();
        name.add("Naveen");
        name.add("Kumar");
        name.add("Rohit");
        name.add("Singh");
       List<String> list=name.stream().sorted().collect(Collectors.toList());
        System.out.println(list);
    }
}
