package AbhinavSirLabWork.File_Handling;

import java.util.Arrays;

public class Hello {
    public static void main(String[] args) {
//        Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
//
//
//                Input: nums = [X]
//        Output: 3
        int[] array=new int[]{1,2,0};
       int num= smallestInteger(array);
        System.out.println(num);
    }
    public static int smallestInteger(int[] array){
        int min=1;
        Arrays.sort(array); // -1 1 3 4
        for (int i=0;i<array.length;i++){
           if (array[i]==min){
               min++;
           }else if(array[i]>min){
               break;
           }
        }
        return min;
    }
}
