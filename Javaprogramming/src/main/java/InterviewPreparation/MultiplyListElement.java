package InterviewPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MultiplyListElement {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
       /* Optional<Integer> a=list.stream().reduce((x, y)->x*y);

        System.out.println(a);*/
        if (list.size()>1){
            Integer ix=1;
            for (Integer in:list)
            {
                ix=ix*in;
                // System.out.println(ix);
            }
            System.out.println(ix);
        }
        else {
            System.out.println("Empty list");
        }
        }

}
