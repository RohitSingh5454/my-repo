package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;

public class bubbleSorting {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,4,5,6,17,12,72,15};
        int[] sortedArray=bubbleSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
    public static int[] bubbleSort(int[] array){
        int temp;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}
