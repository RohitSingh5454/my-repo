package AbhinavSirLabWork.InterviewCoding.Arosys_Bhilai;

import java.util.List;
import java.util.stream.Collectors;

public class StartsWith1 {
    public static void main(String[] args) {
        List<String> list=List.of("Hello","1World","1sir","free");
        list.stream().filter(i->i.startsWith("1")).collect(Collectors.toList()).forEach(System.out::println);
    }
}
