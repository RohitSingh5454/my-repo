package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.HashMap;
import java.util.Map;

public class continuousSubArrays {
    public static void main(String[] args) {
        continuousSubArray(new int[]{2, 4, 2, 8, 3, 3, 2, -4, 12}, 8);
        getContinuousSubArrays(new int[]{2, 4, 2, 8, 3, 3, 2, -4, 12}, 8);
    }
    // brute force approach
    public static void continuousSubArray(int[] array,int n){
        int currSum=0;
        int start=0;
        for (int i=0;i<array.length;i++){
            currSum=array[i];
            if (array[i]==n){
                System.out.print(array[i]+" ");
                System.out.println();
            }
            for (int j=i+1;j<array.length;j++){
                currSum=currSum+array[j];
                if (currSum==n){
                    for (int k=i;k<=j;k++){
                        System.out.print(array[k]+" ");
                    }
                    System.out.println();
                }else if (currSum>n){
                    break;
                }
            }
        }
    }
    // using hashmap
    public static void getContinuousSubArrays(int[] array,int n){
        int currSum=0;
        int start=0;
        int end=-1;
        Map<Integer,Integer> hm=new HashMap<>();
        for (int i=0;i<array.length;i++){
            currSum=currSum+array[i];
            if (currSum==n){
                printSubArray(array,0,i);
            }
            if (hm.containsKey(currSum-n)){
               // System.out.println(hm.get(currSum-n)+1);
                start=hm.get(currSum-n)+1;
                end=i;
                printSubArray(array,start,end);
            }
            hm.put(currSum,i);
        }
    }
    public static void printSubArray(int[] array,int start,int end){
        for (int k=start;k<=end;k++){
            System.out.print(array[k]+" ");
        }
        System.out.println();
    }
}

