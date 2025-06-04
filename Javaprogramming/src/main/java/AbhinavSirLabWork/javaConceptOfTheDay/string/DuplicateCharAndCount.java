package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharAndCount {
    public static void main(String[] args) {
        duplicateWords("Bread butter and bread");

       duplicateWords("Java is java again java");

        duplicateWords("Super Man Bat Man Spider Man");
    }
    public static void duplicateWords(String str){
        String[] stringArray=str.toLowerCase().split(" ");

        HashMap<String,Integer> hm=new HashMap<>();
        for (String strs:stringArray){
            if (hm.containsKey(strs)){
                hm.put(strs,hm.get(strs)+1);
            }else {
                hm.put(strs,1);
            }
        }
        for (Map.Entry<String,Integer> entry:hm.entrySet()){
            if (entry.getValue()>1){
//                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }
      // using java-8
        Set<String> hs=new HashSet<>();
        List<String> duplicate= Arrays.stream(stringArray).filter(i->!hs.add(i)).limit(1).collect(Collectors.toList());
//        System.out.println(duplicate);
        Set<Map.Entry<String,Long>> hms=Arrays.stream(stringArray)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()>1).collect(Collectors.toSet());
        System.out.println(hms);

    }
}
