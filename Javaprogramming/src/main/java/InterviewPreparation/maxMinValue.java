package InterviewPreparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maxMinValue {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,23,11,56,44,89,76,55,69);
        int max=list.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);
        int min=list.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);
    }
}
