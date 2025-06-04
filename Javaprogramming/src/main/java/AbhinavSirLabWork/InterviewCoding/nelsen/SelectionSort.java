package AbhinavSirLabWork.InterviewCoding.nelsen;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
       int[] array={1,5,2,9,7,4,6};
       sortArrayUsingSelectionSort(array);
    }
    public static void sortArrayUsingSelectionSort(int[] array){

        for (int i=0;i< array.length;i++){
            int min=i;
            for (int j=i+1;j< array.length-1;j++){
                if (array[min]>array[j]){
                    min=j;
                }
            }
            int temp=array[i];
            array[i]=array[min];
            array[min]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
