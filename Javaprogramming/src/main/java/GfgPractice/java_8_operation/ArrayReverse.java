package GfgPractice.java_8_operation;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] array={1,2,4,5,8,9,3,6};
        //reverseRecursion(array,0,array.length-1);
        // using java_8
        int[] arrays= IntStream.rangeClosed(1, array.length).map(i->array[array.length-i]).toArray();
        System.out.println(Arrays.toString(arrays));
        String sentence="i am an Enginner";
        Long count=Arrays.stream(sentence.split(" ")).collect(Collectors.counting());
        System.out.println("count of sentence "+count);
    }
    public static void reverseRecursion(int[] array,int start,int end){
        if (start>=end){
            System.out.println(Arrays.toString(array));
            return;
        }
        int temp=array[start];
        array[start]=array[end];
        array[end]=temp;
        reverseRecursion(array, start+1, end-1);
    }
}
