package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] array={64 ,25 ,12 ,22 ,11};
        sortArrayUsingSelSort(array);
    }
    public static void sortArrayUsingSelSort(int[] array){
        for (int i=0;i< array.length;i++){
            int min_index=i;
            for (int j=i+1;j< array.length;j++){
                if (array[min_index]>array[j]){
                    min_index=j;
                }
            }
            int temp=array[i];
            array[i]=array[min_index];
            array[min_index]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
