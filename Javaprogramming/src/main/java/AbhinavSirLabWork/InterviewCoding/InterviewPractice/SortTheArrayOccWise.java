package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortTheArrayOccWise {
    public static void main(String[] args) {
        int[] array={3,1,1,2,2,1,2,1,3};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (Integer i:array){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
       List<Integer> integerList= hm.entrySet().stream()
               .sorted(Comparator.comparing(Map.Entry::getValue)).map(i->i.getKey()).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
