package Java8_150Coding.sum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class minElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        list.stream().sorted(Comparator.naturalOrder()).findFirst().ifPresent(min-> System.out.println("Min element is "+min));
    }
}
