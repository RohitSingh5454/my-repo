package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.*;

public class AnagramString {
    public static void main(String[] args) {
      List<String> list=groupAnagram(Arrays.asList("geeksquiz", "geeksforgeeks", "abcd",
                "forgeeksgeeks", "zuiqkeegs"));
        System.out.println(list);
}
public static List<String> groupAnagram(List<String> strings){
        HashMap<String,List<String>> hm=new HashMap<>();
        List<String> list=new ArrayList<>();
        for (String str:strings){
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String newStr=new String(chars);
            if (hm.containsKey(newStr)){
                hm.get(newStr).add(str);
            }
            else {
                hm.put(newStr,new ArrayList<>(List.of(str)));
            }
        }
        for (Map.Entry<String,List<String>> map: hm.entrySet()){
            list.add(map.getValue().toString());
        }
       return list;
    }
}
