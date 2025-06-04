package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class SmallNoNotInSumArray {
    public static void main(String[] args) {
        int[] array={4,1,9,2};
        int smallNo=smallNoNotInSubArray(array);
        System.out.println(smallNo);
    }
    public static int smallNoNotInSubArray(int[] array){
        Arrays.sort(array);
        int minNo=1;
        for (int i=0;i<array.length;i++){
            if (array[i]>minNo){
                break;
            }
            minNo=minNo+array[i];
        }
        return minNo;
    }

}
