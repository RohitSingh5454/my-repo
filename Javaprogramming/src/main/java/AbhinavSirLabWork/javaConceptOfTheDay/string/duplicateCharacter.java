package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class duplicateCharacter {
    public static void main(String[] args) {
        String str = "Hello my world";
        String str1 = str.replaceAll(" ", "");
        HashMap<Character,Integer> hm=new HashMap<>();
        for (char ch:str1.toCharArray()){
            if (hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else {
                hm.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer> map:hm.entrySet()){
            if (map.getValue()>1){
                System.out.println(map.getKey());
            }
        }
    }
}
