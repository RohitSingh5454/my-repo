package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class SmallNoNotInSumArr {
    public static void main(String[] args) {
        int[] array={4,1,3,5}   ;
        int smallNo=smallNoNotInSumArray(array);
        System.out.println(smallNo);
    }
    public static int smallNoNotInSumArray(int[] array){
        int sum=1;
        Arrays.sort(array);
        for (int i=0;i<array.length;i++){
            if (array[i]>sum){
                break;
            }
            sum=sum+array[i];
        }
        return sum;
    }
}
