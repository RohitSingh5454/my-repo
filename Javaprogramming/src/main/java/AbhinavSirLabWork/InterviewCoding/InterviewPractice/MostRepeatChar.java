package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatChar {
    public static void main(String[] args) {
        String str="Hello world";
        char[] charArray=str.toCharArray();
        HashMap<Character,Integer> hm=new HashMap<>();
        for (char ch:charArray){
            if (hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else {
                hm.put(ch,1);
            }
        }
        char maxChar=' ';
        int maxValue=1;
        for (Map.Entry<Character,Integer> entry: hm.entrySet()){
            if (entry.getValue()>maxValue){
                maxValue=entry.getValue();
                maxChar= entry.getKey();
            }
        }
        System.out.println("Maximum "+maxChar) ;
    }
}
