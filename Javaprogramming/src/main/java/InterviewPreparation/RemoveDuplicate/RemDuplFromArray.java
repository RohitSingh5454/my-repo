package InterviewPreparation.RemoveDuplicate;

import java.util.*;
import java.util.stream.Collectors;

public class RemDuplFromArray {
    public static void main(String[] args) {
        Integer[] sip=new Integer[]{89,34,56,78,78,89};

        //1st way

        List<Integer> remoDup= Arrays.asList(sip).stream().distinct().collect(Collectors.toList());
        System.out.println(remoDup);

        // 2nd way
        Set sop=new HashSet<>(Arrays.asList(sip));
        System.out.println(sop);


    }
}
