package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.HashMap;
import java.util.HashSet;

public class twoSum {
    public static void main(String[] args) {
        int[] arr1={1,3,9,5,8,12};
        int target=17;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<arr1.length;i++){
            int c=target-arr1[i];
            if (hm.containsKey(c)){
                System.out.println(hm.get(c)+" "+i);
            }
            else {
                hm.put(arr1[i],i);
            }
        }
    }
}
