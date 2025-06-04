package AbhinavSirLabWork.javaConceptOfTheDay;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class hello {
    public static void main(String[] args) {


        String msg = "web application is dynamic extension of a web or application server";
       // char[] msg1=msg.toCharArray();
        List<String> strings=Arrays.asList(msg.split("\\s+"));

               // print repeating / duplicate words from the string
        HashSet<String> hashSet=new HashSet<>();
       List<String> arr=strings.stream().filter(i->!hashSet.add(i)).collect(Collectors.toList());
        System.out.println(arr);
    }
}