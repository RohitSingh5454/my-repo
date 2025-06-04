package AbhinavSirLabWork.javaConceptOfTheDay.java_8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class comparingKey {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<String, Integer>();
        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);
      Map<String,Integer> map=  studentMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2, LinkedHashMap::new));
        System.out.println("Before sorting");
        System.out.println(studentMap);
        System.out.println("after sorting");
        // System.out.println(map);
        // another way
       Map<String,Integer> sortByDesc= studentMap.entrySet().stream().
                sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2 ,LinkedHashMap::new));
        System.out.println(sortByDesc);
    }
}
