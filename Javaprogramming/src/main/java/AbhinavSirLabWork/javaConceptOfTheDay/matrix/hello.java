package AbhinavSirLabWork.javaConceptOfTheDay.matrix;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class hello {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 10, 12, 14};
        int target = 7;
        int num = 0;
               /*Input:
Array: [1, 2, 4, 6, 10, 12, 14]
Target: 0
    }*/
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > target) {

                num = arr1[i] - 1;
                break;
            }
        }
        System.out.println(num);
    }
    }

