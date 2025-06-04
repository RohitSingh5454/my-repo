package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMapKey {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Raman");
        hm.put(2,"karan");
        hm.put(4,"Somesh");
        hm.put(5,"nandan");
        hm.put(3,"ashish");
        Map<Integer,String> sortByKey=new HashMap<>(new TreeMap<>(Collections.reverseOrder()));
        sortByKey.putAll(hm);
        System.out.println(sortByKey);
        Map<Integer,String> sortByKeys=new HashMap<>(new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }));
        sortByKeys.putAll(hm);
        System.out.println(sortByKeys);
        Map<Integer,String> sortByKey1=hm.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
        System.out.println(sortByKey1);
        // using java-8

//        for (Map.Entry<Integer,String> entry: hm.entrySet()){
//
//        }
    }
}
