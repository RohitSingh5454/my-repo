package AbhinavSirLabWork.javaConceptOfTheDay.array;

import java.util.Arrays;

public class minimumAbsoluteDifference {
    public static void main(String[] args) {
        System.out.println(minimumDifference(new int[]{0, 2, 4, 5, 8, 9}));
    }

    public static int minimumDifference(int[] array) {
        Arrays.sort(array);
        int firstElement=array[0];
        int secondElement=array[1];
        int minimum = Math.abs(array[1] - array[0]);
        for (int i = 2; i < array.length; i++) {
                if (array[i] - array[i-1] < minimum) {
                    minimum = Math.abs(array[i] - array[i-1]);
                    firstElement=array[i-1];
                    secondElement=array[i];
                }
            }
        System.out.println("pairs of element "+firstElement+" "+secondElement);
        return minimum;
    }
}
