package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class findDuplicate {
    public static void main(String[] args) {
       HashSet<Integer> getDuplicate=findDuplicates(new int[]{1,2,3,2,4,5,6,4,2});
        System.out.println(getDuplicate);
        findDiplicateHashmap(new int[]{1,2,3,2,4,5,6,4,2});
    }
    public static HashSet<Integer> findDuplicates(int[] array){
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i< array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]==array[j]){
                    hs.add(array[i]);
                    //System.out.print(array[i]+" ");
                }
            }
        }
        return hs;
    }
    public static void findDiplicateHashmap(int[] array){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i:array){
            if (hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else {
                hm.put(i, 1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet=hm.entrySet();
        for (Map.Entry<Integer,Integer> entry:entrySet){
            if (entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}
