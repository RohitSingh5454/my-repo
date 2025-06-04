package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr={1,0,2,0,4};
        int length=arr.length;
        for (int j = 0; j < length - 1; j++) {

            // Checking the condition for two
            // simultaneous elements of the array
            if (arr[j] > arr[j + 1]) {
                // Swapping the elements.
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                // updating the value of j = -1
                // so after getting updated for j++
                // in the loop it becomes 0 and
                // the loop begins from the start.
                j=-1;
                System.out.println(j);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
