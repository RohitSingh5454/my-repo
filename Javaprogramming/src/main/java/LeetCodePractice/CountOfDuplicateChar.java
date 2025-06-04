package LeetCodePractice;
import java.util.HashMap;
import java.util.Map;

public class CountOfDuplicateChar {
    public static void main(String[] args) {
        String str="manojpandey";
        String strs="";
        HashMap<Character,Integer> hm=new HashMap<>();
        for (char ch:str.toCharArray()){
            if (hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else {
                hm.put(ch,1);
            }
        }
        for (Map.Entry<Character,Integer> map: hm.entrySet()){
            if (map.getValue()>1){
                strs=strs+map.getKey()+"="+map.getValue()+" ";
            }
        }
        System.out.println(strs);
    }
}
