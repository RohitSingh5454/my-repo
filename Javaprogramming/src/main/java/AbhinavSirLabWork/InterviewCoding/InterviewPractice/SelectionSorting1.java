package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class SelectionSorting1 {
    public static void main(String[] args) {
        int[] array={12,4,7,13,8,26,22,11};
        System.out.println(Arrays.toString(selectionSort(array)));
    }
    public static int[] selectionSort(int[] array){
        int i=0;
        while (i< array.length){
            int min=i;
            for (int j=i+1;j< array.length;j++){
                if (array[min]>array[j]){
                    min=j;
                }
            }
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
            i++;
        }
        return array;
    }
}
