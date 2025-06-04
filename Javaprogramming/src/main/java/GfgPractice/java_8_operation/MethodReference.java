package GfgPractice.java_8_operation;

import java.util.*;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,4,2,9,5,6);
        list.stream().sorted(Integer::compareTo).forEach(System.out::println);
        list.stream().sorted((a,b)->a.compareTo(b)).forEach(System.out::println);
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(4,"d");
        hm.put(3,"c");
        System.out.println(hm.get(4)+" ");
        TreeMap<Integer,String> tm=new TreeMap<>(hm);
        System.out.println(tm);
    }
}
