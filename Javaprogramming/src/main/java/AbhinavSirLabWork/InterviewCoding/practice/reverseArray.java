package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        // without creating array
        int[] arr1={1,34,56,78,90};
       for (int i=0;i<arr1.length/2;i++){
            int temp=arr1[i];
            arr1[i]=arr1[arr1.length-i-1];
            arr1[arr1.length-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr1));
        // by creating new array
        int[] arr2=new int[arr1.length];
        for (int i=0;i<arr1.length;i++){
            arr2[i]=arr1[arr1.length-i-1];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
