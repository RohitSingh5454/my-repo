package AbhinavSirLabWork.javaConceptOfTheDay.number;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        getSumIndex(new int[]{1,2,4,6,7,8},9);
    }
    public static void getSumIndex(int[] arr1,int target){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<arr1.length;i++){
            int num=target-arr1[i];
            if (hm.containsKey(num)){
                System.out.println(arr1[hm.get(num)]+" "+arr1[i]);
            }
            else {
                hm.put(arr1[i],i);
            }

        }
    }

}
