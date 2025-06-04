package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class SelectionSorting2 {
    public static void main(String[] args) {
        int[] array={5,2,9,7,3,8};
        selectionSorting(array);
    }
    public static void selectionSorting(int[] array){
        for (int i=0;i<array.length;i++){
            int min=i;
            for (int j=i+1;j< array.length;j++){
                if (array[j]<array[min]){
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
