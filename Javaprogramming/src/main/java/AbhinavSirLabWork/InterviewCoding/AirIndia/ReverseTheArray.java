package AbhinavSirLabWork.InterviewCoding.AirIndia;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
      reverseArray(new int[]{1,2,3,5,6,4,7});
      reverseArray2(new int[]{1,2,3,5,6,4,7});
    }
    public static void reverseArray(int[] array){
        int[] array1=new int[array.length];
        for (int i=0;i<array.length;i++){
            array1[i]=array[array.length-i-1];
        }
        System.out.println(Arrays.toString(array1));
    }
    // another way
    public static void reverseArray2(int[] array){
        for (int i=0;i<array.length/2;i++){
            int t=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=t;
        }
        System.out.println(Arrays.toString(array));
    }
}
