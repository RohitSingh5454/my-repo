package InterviewPreparation.array;

import java.util.*;

public class findDuplicates {
    public static void main(String[] args) {
       // duplicateCheck(new int[]{1,2,3,2,5,4,1});
        //duplicateCheck1(new int[]{1,2,4,6,1,7,4,8,7});
        duplicateCheck2(new int[]{1,2,3,2,4,5,1,3});
    }
    // 1st way
    public static void duplicateCheck(int[] arr){
        Arrays.sort(arr);
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]==arr[i+1]){
               // System.out.println(arr[i]);
            }
        }
    }
    // 2nd way
    public static void duplicateCheck1(int[] arr1){
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0;i<arr1.length;i++){
            for (int j=i+1;j<arr1.length;j++){
                if (arr1[i]==arr1[j]){
                    hashSet.add(arr1[i]);
                }
            }
        }
        System.out.println(hashSet);
    }
    // using hashmap
    public static void duplicateCheck2(int[] arr2){
    HashMap<Integer,Integer> map=new HashMap<>();
    for (int element:arr2){
        if (map.get(element)==null){
            map.put(element,1);
        }
        else {
            map.put(element,map.get(element)+1 );
        }}
        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();
       for (Map.Entry<Integer,Integer> entry:entrySet){
           if (entry.getValue()>1){
               System.out.println(entry.getKey() +" "+entry.getValue());
           }

    }

}}
