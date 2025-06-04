package AbhinavSirLabWork.InterviewCoding.britainTelecom;

import java.util.Arrays;
import java.util.HashSet;

public class rearrangeArray {
    public static void main(String[] args) {
        int[] arr1={12,56,0,34,0,0,89,0};
        for (int i=0;i<arr1.length;i++){
            for (int j=i+1;j<arr1.length;j++){
                if (arr1[i]<arr1[j]){
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
