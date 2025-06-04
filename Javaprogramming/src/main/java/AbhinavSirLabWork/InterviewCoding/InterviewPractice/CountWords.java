package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.HashMap;

public class CountWords {
    public static void main(String[] args) {
        String str="Bangalore bangalore goa Goa";
        String sts=str.toLowerCase();
        HashMap<String,Long> hm=new HashMap<>();
        String[] strArray=sts.split(" ");
        for (String strs:strArray){
            if (hm.containsKey(strs)){
                hm.put(strs,hm.get(strs)+1);
            }else {
                hm.put(strs,1L);
            }
        }
        System.out.println(hm);
    }
}
