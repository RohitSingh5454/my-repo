package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;

public class zeroToStartingArray {
    public static void main(String[] args) {
       rotate(new int[]{1,34,56,0,23,0,0,17});
    }
    public static void rotate(int[] arr){
        int count=arr.length-1;
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]!=0){
                arr[count]=arr[i];
                count--;
            }
        }
        while (count>=0){
            arr[count]=0;
            count--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
