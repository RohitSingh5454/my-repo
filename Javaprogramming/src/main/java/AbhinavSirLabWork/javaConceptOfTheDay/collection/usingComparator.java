package AbhinavSirLabWork.javaConceptOfTheDay.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class usingComparator {
    public static void main(String[] args) {
        HashMap<String,Integer> studentMap=new HashMap<>();
        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);
        Map<String,Integer> mapUse=new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        mapUse.putAll(studentMap);
        System.out.println("before sorting");
        System.out.println(studentMap);
        System.out.println("after sorting");
        System.out.println(mapUse);
    }
}
