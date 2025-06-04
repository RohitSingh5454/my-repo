package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicateUsingHashmap {
    public static void main(String[] args) {
        int[] array1={12,2,3,34,45,56,34};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i:array1){
            if (hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else {
                hm.put(i,1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entry=hm.entrySet();
        for (Map.Entry<Integer,Integer> entry1:entry){
            if (entry1.getValue()>1){
                System.out.println(entry1.getKey());
            }
        }
    }
}
