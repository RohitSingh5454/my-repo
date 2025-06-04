package AbhinavSirLabWork.InterviewCoding.nelsen;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
    int[] array={4,1,2,7,5,9,22,11};
    insertionSortingArray(array);
    }
    public static  void insertionSortingArray(int[] array){
        int n=array.length;
        int temp,j;
        for (int i=1;i<n;i++){
            temp=array[i];  // 1
            j=i;
            while (j>0 && array[j-1]>temp){
                array[j]=array[j-1];
                j=j-1;
            }
            array[j]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
