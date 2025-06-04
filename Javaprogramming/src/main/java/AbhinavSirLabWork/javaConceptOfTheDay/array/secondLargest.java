package AbhinavSirLabWork.javaConceptOfTheDay.array;

import HowToDoInJava8.Stream.Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr1=new int[]{12, 45, 32, 78, 24, 65, 98};
        System.out.println(secondLargest(arr1));
       int secondLargestss= Arrays.stream(arr1).boxed().sorted((b,a)->a-b).distinct().skip(1).findFirst().get();
        System.out.println(secondLargestss);
    }

    public static int secondLargest(int[] array) {
        int largest;
        int secondLargest;
        if (array[0] > array[1]) {
            largest = array[0];
            secondLargest=array[1];
        } else {
            secondLargest = array[0];
            largest=array[1];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];

            } else if (array[i] < largest && secondLargest < array[i]) {
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

}
