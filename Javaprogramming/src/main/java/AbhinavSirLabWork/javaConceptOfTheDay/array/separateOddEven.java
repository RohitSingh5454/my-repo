package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class separateOddEven {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Map<Boolean,List<Integer>> count=list.stream().collect(Collectors.partitioningBy(i->i%2==0));
        Set<Map.Entry<Boolean,List<Integer>>> entries=count.entrySet();
        for (Map.Entry<Boolean,List<Integer>> entry:entries){
            System.out.println("-----");
            if (entry.getKey()){
                System.out.println("even numbers");
            }
            else {
                System.out.println("Odd numbers");
            }
            System.out.println();
            List<Integer> integerList=entry.getValue();
            for (int i:integerList){
                System.out.println(i);
            }
        }

    }
}
