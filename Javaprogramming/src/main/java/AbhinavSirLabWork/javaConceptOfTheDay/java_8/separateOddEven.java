package AbhinavSirLabWork.javaConceptOfTheDay.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class separateOddEven {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<Integer> oddList=listOfIntegers.stream().filter(i->i%2!=0).collect(Collectors.toList());
        System.out.println("odd "+oddList);
        Map<Boolean,List<Integer>> oddEvenNumbersMap=listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
        Set<Map.Entry<Boolean,List<Integer>>> entrySet=oddEvenNumbersMap.entrySet();
        for (Map.Entry<Boolean,List<Integer>> entry:entrySet){
            System.out.println("---------");
            if (entry.getKey()){
                System.out.println("Even numbers");
            }else {
                System.out.println("odd numbers");
            }
            System.out.println("---------");
            List<Integer> list=entry.getValue();
            for (int i:list){
                System.out.println(i);
            }
        }
    }
}
