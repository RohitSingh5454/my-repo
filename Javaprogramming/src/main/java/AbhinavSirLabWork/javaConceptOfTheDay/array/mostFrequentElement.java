package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mostFrequentElement {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,1,5,6,7,1,2,3,8};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i< array.length;i++){
            if (hm.containsKey(array[i])){
                hm.put(array[i],hm.get(array[i])+1);
            }
            else {
                hm.put(array[i],1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet=hm.entrySet();
        int element=0;
        int elementValue=1;
        for (Map.Entry<Integer,Integer> entries:entrySet){
            if (entries.getValue()>elementValue){
                element=entries.getKey();
                elementValue=entries.getValue();
            }
        }
        System.out.println("Most repeating element "+element +" and count of that element "+elementValue);
    }
}
