package AbhinavSirLabWork.javaConceptOfTheDay.java_8.string;

import java.util.*;
import java.util.stream.Collectors;

public class duplicateChar {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        char[] ch=inputString.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        for (char i:ch){
            if (hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else {
                hm.put(i,1);
            }
        }
        Set<Map.Entry<Character,Integer>> entries=hm.entrySet();
        for (Map.Entry<Character,Integer> entry:entries){
            if (entry.getValue()>1){
               //
                //System.out.println(entry.getKey());
            }
        }
        // using java-8
        HashSet<String> hs=new HashSet<>();
        Arrays.stream(inputString.split("")).filter(i->!hs.add(i)).collect(Collectors.toList()).forEach(System.out::println);
    }
}
