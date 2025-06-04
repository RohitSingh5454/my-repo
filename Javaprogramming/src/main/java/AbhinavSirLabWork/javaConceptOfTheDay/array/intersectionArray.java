package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.HashSet;

public class intersectionArray {
    public static void main(String[] args) {
        int[] arr1={12,24,54,34,75,59};
        int[] arr2={45,32,12,59,76,33};
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j< arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    hs.add(arr1[i]);
                }
            }
        }
        System.out.println("common elemnts present "+hs);
    }
}
