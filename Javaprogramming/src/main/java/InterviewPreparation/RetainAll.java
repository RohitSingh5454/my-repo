package InterviewPreparation;

import java.util.ArrayList;
import java.util.List;

public class RetainAll {

    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>(List.of(1,2,3,4,5,6,7));
        List<Integer> l2=List.of(1,2,3,4);
        l1.retainAll(l2);
        System.out.println(l1);
        System.out.println(l2);
    }
}
