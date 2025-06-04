package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.*;

public class AnagStringList {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("eat","tea","tan","ate","nat","bat");
        HashMap<String,List<String>> hm=new HashMap<>();
        for (String str:list){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String newString=new String(ch);
            if (hm.containsKey(newString)){
                hm.get(newString).add(str);
            }
            else {
                hm.put(newString,new ArrayList<>(List.of(str)));
            }
        }
        for (Map.Entry<String,List<String>> entry: hm.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
