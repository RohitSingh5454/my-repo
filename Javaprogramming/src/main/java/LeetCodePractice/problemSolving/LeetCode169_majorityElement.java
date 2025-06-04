package LeetCodePractice.problemSolving;

import java.util.Arrays;

public class LeetCode169_majorityElement{
    public static void main(String[] args) {
        int[] array=new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(array));
        int[] array1=new int[]{2,2,1,1,2,2,1};
        System.out.println(majorityElement2(array1));
    }
    public static int majorityElement(int[] array1){
        int length=array1.length;
        Arrays.sort(array1);
        int element = 0;
        for (int i=0;i<array1.length;i++){
            if (array1[i]==array1[length/2]){
                element=array1[i];
            }
//            else {
//                System.out.println("There is no maximum element present in array");
//            }
        }
        return element;
    }
    public static int majorityElement2(int[] array1){
        int votes=0;
        int majority=array1[0];
        for (int i=1;i<array1.length;i++){
            if (votes==0){
                votes++;
            } else if (majority==array1[i]) {
                votes++;
            }
            else {
                votes--;
            }
        }
        return majority;
    }
}
