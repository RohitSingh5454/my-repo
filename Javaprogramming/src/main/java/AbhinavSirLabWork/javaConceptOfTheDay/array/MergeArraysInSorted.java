package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeArraysInSorted {
    public static void main(String[] args) {
        mergeInSortedArrayJava8(new int[]{7, -5, 3, 8, -4, 11, -19, 21},new int[]{6, 13, -7, 0, 11, -4, 3, -5});
        mergeInSortedArrayJava7(new int[]{7, -5, 3, 8, -4, 11, -19, 21},new int[]{6, 13, -7, 0, 11, -4, 3, -5});
    }
    public static void mergeInSortedArrayJava7(int[] array1,int[] array2){
        int[] sortedArray=new int[array1.length+array2.length];
        int i=0,k=0,j=0;
        while (i<array1.length){
            sortedArray[i]=array1[i];
            i++;
            k++;
        }
        while (j<array2.length){
             sortedArray[k]=array2[j];
             j++;
             k++;
        }
        HashSet<Integer> hs=new HashSet<>();
        for (int m=0;m<=sortedArray.length;m++){
            hs.add(sortedArray[m]);
        }
        //Arrays.sort(hs);
        System.out.println(Arrays.toString(sortedArray));
    }
    // using java-8
    public static void mergeInSortedArrayJava8(int[] array1,int[] array2){
       int[] mergeToSortedArray= IntStream.concat(Arrays.stream(array1),Arrays.stream(array2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(mergeToSortedArray));
    }
}
