package AbhinavSirLabWork;

import java.util.HashSet;

public class ARray {
    public static void main(String[] args) {
       ArrayDuplicate(new int[]{1,2,3,4,2,5,6,3});
    }

    public static void ArrayDuplicate(int[] arr) {
        int[] temp=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length-1;i++){
                if (arr[i]!=arr[i+1]){
                   temp[j++]=arr[i];

                }
            }
        temp[j++]=arr[arr.length-1];
        for (int k=0;k<j;k++){
            System.out.println(temp[k]);
        }
        }
    }


