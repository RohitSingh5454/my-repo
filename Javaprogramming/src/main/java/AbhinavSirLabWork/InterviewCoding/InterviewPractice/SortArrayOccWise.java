package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayOccWise {
    public static void main(String[] args) {
         sortOccWise(new int[]{1,4,2,4,3,2,4,3,4,3});
    }
    public static void sortOccWise(int[] array){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i:array){
            if (hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else {
                hm.put(i, 1);
            }
        }
       List<Integer> list= hm.entrySet().stream().sorted(Comparator.comparingInt(i->i.getValue()))
               .map(k->k.getKey()).collect(Collectors.toList());
        System.out.println(list);
    }
}
