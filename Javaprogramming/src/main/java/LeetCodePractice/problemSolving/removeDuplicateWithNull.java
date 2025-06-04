package LeetCodePractice.problemSolving;

import java.util.Arrays;

public class removeDuplicateWithNull {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,2,3,4,4,5};
        int[] arrNew=new int[arr.length];
        Object[] arrNew1 = new Object[arr.length];
        int unique=0;
        for (int i=0;i<arr.length-1;i++){
            if (i==0 || arr[i]!=arr[i-1]){
                arrNew1[unique]=arr[i];
                unique++;
            }

        }
        System.out.println(unique);
        for (int i=unique;i<arrNew1.length;i++ ){
            arrNew1[i]=null;
        }
        System.out.println(Arrays.toString(arrNew1));
    }
}
