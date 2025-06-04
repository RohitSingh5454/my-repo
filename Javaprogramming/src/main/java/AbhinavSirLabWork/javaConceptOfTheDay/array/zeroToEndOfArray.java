package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.*;

public class zeroToEndOfArray {
    public static void main(String[] args) {
       // System.out.println(rearrangeArray(new int[]{1,2,13,0,34,56,0,17,0}));
        int[] array=new int[]{1,2,13,0,34,56,0,17,0};
        int[] array1=new int[array.length];
        for (int i=0;i< array.length;i++){
            for (int j=i+1;j< array.length;j++){
                if (array[i]>array[j]){
                    array1[i]=array[i];
                }
            }
        }
        for (int k=0;k<array1.length;k++){
            System.out.println(array1[k]);
        }

    }
    public static boolean rearrangeArray(int[] array){
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i< array.length;i++){
            for (int j=i+1;j< array.length;j++){
                if (array[i]>array[j]){
                    System.out.println(array[i]);
                }
            }
        }
        //return hs;
        return false;
    }
}
