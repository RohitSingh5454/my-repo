package Java8_150Coding.Comparator;

import java.util.*;

public class ListImplement {
    public static void main(String[] args) {
      /*  List<String> list= List.of("Sanket","Brijbhushan","Vinod","Lokesh","Anand");
        TreeSet<String>  treeSet=new TreeSet<>(list);
        System.out.println(treeSet);*/
        // using map
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Manoj", 12);
        map.put("Sankarji", 23);
        map.put("Chaman", 17);
        map.put("Lokesh", 21);
        map.put("sravan", 34);
        Map<String, Integer> sortedMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        sortedMap.putAll(map);
        System.out.println("Before sorting");
        System.out.println(map);
        System.out.println("After sorting");
        System.out.println(sortedMap);
    }
}

