package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class SmalllNumNotInSumArr {
    public static void main(String[] args) {
        int[] array={1,4,7,10};
        int smallNo= smallNoNotInArraySum(array);
        System.out.println(smallNo);
}
public static int smallNoNotInArraySum(int[] array){
        int minNum=1;
        Arrays.sort(array);
        for (int i=0;i<array.length;i++){
           if (array[i]>minNum){
               break;
           }
           minNum=minNum+array[i];
        }
        return minNum;
    }
}
