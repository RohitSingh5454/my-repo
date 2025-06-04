package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;

public class twoSortedArray {
    public static void main(String[] args) {
        int[] array1={1,2,3,7,9,12};
        int[] array2={4,5,6,17,21};
       int[] mergedArray= mergeArray(array1,array2);
        System.out.println("Array 1 data "+ Arrays.toString(array1));
        System.out.println("Array 2 data "+Arrays.toString(array2));
        System.out.println("Result array "+Arrays.toString(mergedArray));
    }
    public static int[] mergeArray(int[] arr1,int[] arr2){
        int i=0,j=0,k=0;
        int[] result=new int[arr1.length+arr2.length];
        while (i<arr1.length && j<arr2.length){
            if (arr1[i]<arr2[j]){
                result[k]=arr1[i];
                i++;
                k++;
            }else {
                result[k]=arr2[j];
                j++;
                k++;
            }
        }
        while (i<arr1.length){
            result[k]=arr1[i];
            i++;
            k++;
        }
        while (j<arr2.length){
            result[k]=arr2[j];
            j++;
            k++;
        }
        return result;
    }
}
