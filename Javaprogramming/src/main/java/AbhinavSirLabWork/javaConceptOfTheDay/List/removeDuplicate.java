package AbhinavSirLabWork.javaConceptOfTheDay.List;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicate {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        HashSet<String> hs=new HashSet<>();
        for (String s:listOfStrings){
            hs.add(s);
        }
        List<String> uniqueElement=listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(hs);
        System.out.println(uniqueElement);
    }
}
