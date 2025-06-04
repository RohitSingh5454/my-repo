package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class SmallestNoNotInSumArray {
    public static void main(String[] args) {
        int[] array={1,3,2,6,10,12};
        Arrays.sort(array);
        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>min){
                break;
            }
            min=min+array[i];
        }
        System.out.println(min);
    }
}
