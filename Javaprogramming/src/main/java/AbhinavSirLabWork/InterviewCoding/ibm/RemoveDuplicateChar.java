package AbhinavSirLabWork.InterviewCoding.ibm;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String str="java is a programming language";
        StringBuilder stringBuilder=new StringBuilder();
        char[] chars=str.toCharArray();
        HashMap<Character, Long> hm=new HashMap<>();
        for (char ch:chars){
            if (hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else {
                hm.put(ch,1L);
            }
        }
        for (Map.Entry<Character,Long> map: hm.entrySet()){
            if (map.getValue()==1){
                stringBuilder.append(map.getKey());
            }
        }
        System.out.println(stringBuilder);
    }
}
