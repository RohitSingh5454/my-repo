package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class ArrayReverseRecurssion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverseArray(array,0,array.length-1);
    }
public static void reverseArray(int[] array,int start,int end){
        if (start>=end){
            System.out.println(Arrays.toString(array));
            return;
        }
        int temp=array[start];
        array[start]=array[end];
        array[end]=temp;
        reverseArray(array,start+1,end-1);
    }
}