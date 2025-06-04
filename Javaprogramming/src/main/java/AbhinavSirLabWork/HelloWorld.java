package AbhinavSirLabWork;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5};
        rotateArray1(array,2);
        String str="interview";
        Map<Character,Long> countOccurence=str.chars().
                mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(countOccurence);

    }
    public static void rotateArray1(int[] array,int k){
        int x=array.length;
        k=k%x;
        rotateArray2(array,k,x-1);
        rotateArray2(array,0,x-1);
        rotateArray2(array,k,x-1);
    }


    public static void rotateArray2(int[] array,int k,int end){// k=2
        while (k<end){
            int temp=array[k];
            array[k]=array[end];
            array[end]=temp;
            k++;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }


}
