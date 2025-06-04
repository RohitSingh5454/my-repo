package InterviewPreparation.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenElement {
    public static void main(String[] args) {
        List<Integer> in= Arrays.asList(12, 2, 3, 44, 54, 55, 66);
        List<Integer> odd=in.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(in);
    }
}
