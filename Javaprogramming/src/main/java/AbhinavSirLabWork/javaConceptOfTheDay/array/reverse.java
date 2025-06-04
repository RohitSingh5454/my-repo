package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
     reverseArray(new int[]{1,4,6,8,9});
    }
    public static void reverseArray(int[] array){
        for (int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
