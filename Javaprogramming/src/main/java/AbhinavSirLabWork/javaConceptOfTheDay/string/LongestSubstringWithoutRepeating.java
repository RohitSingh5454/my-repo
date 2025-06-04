package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        LongestSubstring("abbac");
    }
    public static void LongestSubstring(String str){
        char[] chars=str.toCharArray();
        int longestSubStringLength=0;
        String longestSubString=null;
        HashMap<Character,Integer> charCount=new LinkedHashMap<>();
          for (int right=0;right<chars.length;right++){
              char ch=chars[right];
              if (charCount.containsKey(ch)){
                  right=charCount.get(ch);
                  charCount.clear();
              }
              else {
                  charCount.put(ch,right);
              }
              if (charCount.size()>longestSubStringLength){
                  longestSubStringLength=charCount.size();
                  longestSubString=charCount.keySet().toString();
              }
          }
        System.out.println("Longest sub string "+longestSubString);
        System.out.println("Longest sub string length "+longestSubStringLength);
    }
}
