package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;
import java.util.HashSet;

public class SmallNoNotPresentArr {
    public static void main(String[] args) {
        int[] arr={2,4,1,3,8,7};
        int result=smallNoNotInArray1(arr);
        System.out.println(result);
    }
    public static int smallNoNotInArray(int[] array){
        Arrays.sort(array);
        int min=array[0];
        for (int i=0;i<array.length;i++){
               if (array[i]>min){
                   break;
               }
               else{
                   min=array[i]+1;
               }
        }
        return min;
    }
    public static int smallNoNotInArray1(int[] array){
        HashSet<Integer> hs=new HashSet<>();
        for (int num:array){
            hs.add(num);
        }
        int smallestNo=1;
        while (hs.contains(smallestNo)){
            smallestNo++;
        }
        return smallestNo;
    }
}
