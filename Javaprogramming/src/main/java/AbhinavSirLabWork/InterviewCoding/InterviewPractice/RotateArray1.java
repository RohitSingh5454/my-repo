package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;
public class RotateArray1 {
    public static void main(String[] args) {
        int[] array={3,8,7,6,5,9};
        rotateArrayByIndex(array,2); // op-7 6 3 8 5 9
    }
    public static void rotateArrayByIndex(int[] array,int x){
        doOperation(array,0, x+1);
//        doOperation(array,0,x-1);
//        doOperation(array,x, array.length-1);
         doOperation(array,0,x-1);
         doOperation(array,x,x+1);
        System.out.println(Arrays.toString(array));
    }
    public static void doOperation(int[] array,int start,int end){
        while (start<=end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
}
