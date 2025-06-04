package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int target=9;
        for (Integer i:list){
            int value=target-i;
            if (hm.containsKey(value)){
                System.out.println(value+":"+i);
            }else {
                hm.put(i,1);
            }
        }
    }
}
