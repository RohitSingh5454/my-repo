package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occurenceCharacter {
    public static void main(String[] args) {
        String str = "Hello world";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        char[] array = str.toCharArray();
        for (char ch:array){
            if (hashMap.containsKey(ch)){
                hashMap.put(ch, hashMap.get(ch)+1);
            }
            else {
                hashMap.put(ch,1);
            }
        }
        System.out.println("character count "+hashMap);
    }
}
