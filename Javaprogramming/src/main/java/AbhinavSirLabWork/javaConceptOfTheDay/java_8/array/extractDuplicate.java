package AbhinavSirLabWork.javaConceptOfTheDay.java_8.array;

import java.util.*;
import java.util.stream.Collectors;

public class extractDuplicate {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        HashSet<Integer> hs=new HashSet<>();
       List<Integer> duplicate= listOfIntegers.stream().filter(i->!hs.add(i)).collect(Collectors.toList());
        System.out.println(duplicate);
        // by using hashmap
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i:listOfIntegers){
            if (hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else {
                hm.put(i,1);
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet=hm.entrySet();
        for (Map.Entry<Integer,Integer> entry:entrySet){
            if (entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
