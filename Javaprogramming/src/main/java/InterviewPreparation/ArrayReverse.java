package InterviewPreparation;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,7,9};
        reverseArray(array,0,array.length-1);
    }
    public static void reverseArray(int[] array,int x,int y){
        arrayOperation(array,x,y);
        arrayOperation(array,0,1);
        arrayOperation(array,2, array.length-1);

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
