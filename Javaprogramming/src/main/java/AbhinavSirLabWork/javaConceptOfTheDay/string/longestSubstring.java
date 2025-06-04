package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.HashMap;

 class LongestSubstringFind {
    public static void main(String[] args) {
        String str="aabcde";
        char[] ch=str.toCharArray();
        String longestSubString=null;
        int longestSubStringlength=0;
        HashMap<Character,Integer> hs=new HashMap<>();
        for (int i=0;i<ch.length;i++){
            char ch1=ch[i];
            if (!hs.containsKey(ch1)){
                hs.put(ch1,i);
            }
            else {
                i= hs.get(ch1);
                hs.clear();
            }
            if (hs.size()>longestSubStringlength){
                longestSubStringlength=hs.size();
                longestSubString=hs.keySet().toString();
            }
        }
        System.out.println("longest length "+longestSubStringlength);
        System.out.println("longest string "+longestSubString);
    }
}
