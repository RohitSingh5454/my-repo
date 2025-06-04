package AbhinavSirLabWork.javaConceptOfTheDay.Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKey {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Rohit",1);
        hm.put("Raghav",2);
        hm.put("Kalpana",3);
        hm.put("Jitender",4);
        for (Map.Entry<String,Integer> map: hm.entrySet()){
           // Collections.sort(map.getKey());
        }
        Map<String,Integer> sortByKey=new TreeMap<>(hm);
        System.out.println(sortByKey);
    }
}
