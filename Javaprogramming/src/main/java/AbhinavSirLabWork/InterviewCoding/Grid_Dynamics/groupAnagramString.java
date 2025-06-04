package AbhinavSirLabWork.InterviewCoding.Grid_Dynamics;

import java.util.*;

public class groupAnagramString {
    public static void main(String[] args) {
        groupAnagramTogether(Arrays.asList("geeksquiz", "geeksforgeeks", "abcd",
                "forgeeksgeeks", "zuiqkeegs"));
    }
    public static void groupAnagramTogether(List<String> inputStrings){
        HashMap<String,List<String>> hm=new HashMap<>();
        for (String inpStr:inputStrings ){
            char[] ch=inpStr.toCharArray();
            Arrays.sort(ch);
            String newStr=new String(ch);
            if (hm.containsKey(newStr)){
                hm.get(newStr).add(inpStr);
            }else {
                hm.put(newStr,new ArrayList<>(List.of(inpStr)));
            }
        }
        for (Map.Entry<String,List<String>> map: hm.entrySet()){
            System.out.println(map.getValue());
        }
    }
}
