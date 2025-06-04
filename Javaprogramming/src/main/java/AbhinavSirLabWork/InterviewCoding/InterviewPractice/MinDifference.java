package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class MinDifference {
    public static void main(String[] args) {
        int[] array = {9, 4, 7, 18, 8, 12, 13, 22, 14};
        System.out.println(minDiff(array));
    }

    public static int minDiff(int[] array) {
        Arrays.sort(array);
        //1 2 3 8 12 13 14 18 22
        int min_diff = Integer.MAX_VALUE;
        int min=1;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i+1] - array[i] < min_diff) {
                min_diff= array[i+1] - array[i];  // max=1
            }
        }
        return min_diff;

    }
}
