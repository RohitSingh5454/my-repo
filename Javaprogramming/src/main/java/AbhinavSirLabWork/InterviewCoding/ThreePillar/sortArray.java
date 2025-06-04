package AbhinavSirLabWork.InterviewCoding.ThreePillar;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] arr1={1,0,0,0,1,1,0,1,1};
        for (int i=0;i<arr1.length-1;i++){
            if (arr1[i]>arr1[i+1]){
                int temp=arr1[i];
                arr1[i]=arr1[i+1];
                arr1[i+1]=temp;
                i=-1;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
