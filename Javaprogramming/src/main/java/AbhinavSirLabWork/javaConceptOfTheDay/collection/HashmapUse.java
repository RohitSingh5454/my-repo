package AbhinavSirLabWork.javaConceptOfTheDay.collection;

import java.util.*;

public class HashmapUse {
    public static void main(String[] args) {
        HashMap<String,Integer> studentMap=new HashMap<>();
        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);
        System.out.println("before sorting result");
        System.out.println(studentMap);
        TreeMap<String,Integer> ts=new TreeMap<>(studentMap);
        // another way
        Map<String,Integer> ms=new TreeMap<>(Collections.reverseOrder());
        ms.putAll(studentMap);
        System.out.println("after sorting result");
       // System.out.println(ts);
        System.out.println(ms);

    }
}
