package AbhinavSirLabWork.InterviewCoding.PatchInfotech;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        rotateArray(new int[]{1,2,3,4,5},2);
        rotateArrays(new int[]{1,2,3,4,5},2);
    }
    public static void rotateArray(int[] array,int x){
       for (int i=0;i<x;i++){
           int temp=array[0];
           for (int j=0;j<array.length-1;j++){
               array[j]=array[j+1];
           }
           array[array.length-1]=temp;
       }
        System.out.println(Arrays.toString(array));
    }
    public static void rotateArrays(int[] array,int x){
        int n=array.length;
        reverseArray(array,0,x-1);
        reverseArray(array,x,n-1);
        reverseArray(array,0,n-1);
        System.out.println(Arrays.toString(array));
    }

    public static void reverseArray(int[] array,int start,int end){
        while (start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
}
