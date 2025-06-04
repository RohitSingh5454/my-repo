package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        leftArrayRotate(new int[]{1,2,3,4,5,6,7,8},3);
        rightArrayRotate(new int[]{1,2,3,4,5,6,7,8},3);
    }
    // Left array rotation
    public static void leftArrayRotate(int[] array,int x){
        int temp;
        for (int i=0;i<x;i++){
            temp=array[0];
            for (int j=0;j<array.length-1;j++){
                array[j]=array[j+1];
            }
            array[array.length-1]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
    // right array rotation
    public static void rightArrayRotate(int[] array,int x){
        int temp;
        for (int i=0;i<x;i++){
            temp=array[array.length-1];
            for (int j=array.length-1;j>0;j--){
                array[j]=array[j-1];
            }
            array[0]=temp;
        }
        System.out.println(Arrays.toString(array));
    }

}
