package LeetCodePractice.problemSolving;

import java.util.HashMap;
import java.util.Scanner;

public class LeetCode_219_containsDuplicate_2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int z=sc.nextInt();
        int[] array= new int[]{sc.nextInt()};
        System.out.println(containsDuplicate(array,z));

  }
   public static boolean containsDuplicate(int[] nums,int k){
       HashMap<Integer,Integer> hm=new HashMap<>();
       for (int i=0;i<nums.length;i++){
           if (hm.containsKey(nums[i])){
               int idx=hm.get(nums[i]);
               if (i-idx<=k){
                   return true;
               }
               else {
                   hm.put(nums[i],i);
               }
           }else {
               hm.put(nums[i],i);
           }
       }
       return false;
   }
}
