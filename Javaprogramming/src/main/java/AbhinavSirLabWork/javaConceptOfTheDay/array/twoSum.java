package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] arr={1,3,5,6,9,8};
        int target=8;
        for (int i=0;i<arr.length;i++){
            int c=target-arr[i];
            if (hm.containsKey(c)){
                System.out.println(arr[hm.get(c)]+" "+arr[i]);
            }
            else {
                hm.put(arr[i],i);
            }
        }
    }
}
