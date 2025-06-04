package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        rotateArray(new int[]{1,2,3,4,5},2);
    }
   public static void rotateArray(int[] array,int x){
        arrayOperation(array,0,x-1);
       System.out.println(Arrays.toString(array));
        arrayOperation(array,x,array.length-1);
       System.out.println(Arrays.toString(array));
        arrayOperation(array,0,array.length-1);
       System.out.println(Arrays.toString(array));
   }
   public static void arrayOperation(int[] array,int start,int end){
        while (start<=end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
   }
}
