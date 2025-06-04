package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countListString {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("Pen","Pencil","Nataraj","Cutter","Pencil","Rubber");
        // using java-8
        Map<String,Long> countString=strings.stream().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countString);
        // using hashmap
        HashMap<String,Integer> hm=new HashMap<>();
        for (String i:strings){
            if (hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else {
                hm.put(i,1);
            }
        }
        System.out.println(hm);
    }
}
