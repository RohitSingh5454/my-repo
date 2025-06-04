package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.HashMap;
import java.util.Map;

public class occurenceOfDuplicateCharacter {
    public static void countChar(String inputString) {
        char[] strArray=inputString.toCharArray();
        Map<Character,Integer> countChar=new HashMap<>();
        for (char ch:strArray){
            if (countChar.containsKey(ch)){
                countChar.put(ch, countChar.get(ch)+1);
            }
            else {
                countChar.put(ch, 1);
            }
        }
        System.out.println(countChar);

    }

    public static void main(String[] args) {
        String str="Hello this is my world";
        String strLowercase=str.toLowerCase();
        countChar(strLowercase);
    }
}
