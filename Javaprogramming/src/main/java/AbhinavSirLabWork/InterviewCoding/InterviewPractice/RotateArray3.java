package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class RotateArray3 {
    public static void main(String[] args) {
        rotateArray(new int[]{1,2,3,4,5},2); // 4 5 1 2 3
    }
    public static void rotateArray(int[] array,int pos){
        arrayOperation(array,0,2);
        System.out.println(Arrays.toString(array));
        arrayOperation(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
        arrayOperation(array,0,1);
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
       // System.out.println(Arrays.toString(array));
    }
}
