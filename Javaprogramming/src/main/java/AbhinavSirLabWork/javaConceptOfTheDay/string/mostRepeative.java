package AbhinavSirLabWork.javaConceptOfTheDay.string;

import AbhinavSirLabWork.javaConceptOfTheDay.output.C;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mostRepeative {
    public static void main(String[] args) {
        mostRepeatedChar("Java Concept Of The Day");
    }
    public static void mostRepeatedChar(String str){
        HashMap<Character,Integer> hm=new HashMap<>();
        char[] ch=str.replaceAll(" ","").toCharArray();
        for (char chars:ch){
            if (hm.containsKey(chars)){
                hm.put(chars,hm.get(chars)+1);
            }else {
                hm.put(chars,1);
            }
        }
        char maxChar=' ';
        int maxValue=1;
        for (Map.Entry<Character,Integer> entry: hm.entrySet()){
            if (entry.getValue()>maxValue){
                maxValue=entry.getValue();
                maxChar=entry.getKey();
            }
        }
        System.out.println("maximum occuring character is "+maxChar);
    }
}
