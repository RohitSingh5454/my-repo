package AbhinavSirLabWork.InterviewCoding.nelsen;

import java.util.*;
import java.util.stream.Collectors;

public class nonRepeated {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,3,4,5,2,7,8);
        // op-1 4 5 7 8
        HashSet<Integer> hs=new HashSet<>();
       /*List<Integer> set= list.stream().distinct().collect(Collectors.toList());
        System.out.println(set);*/
        for (int i:list){
            if (!hs.contains(i)){
                hs.add(i);
            }
            else {
                hs.remove(i);
            }
        }
        System.out.println("element present without duplicate "+hs);
    }
}
