package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.Arrays;

public class equalityTwoArray {
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 7, 4};
        // iterative process
        boolean isEquals=true;
        if (arrayOne.length==arrayTwo.length){
            for (int i=0;i<arrayOne.length;i++){
                    if (arrayOne[i]!=arrayTwo[i]){
                        isEquals=false;
                    }
                }
            }

        else {
            isEquals=false;
        }
        if (isEquals){
            System.out.println("Two arrays are equal");
        }
        else {
            System.out.println("Two arrays are not equal");
        }
        System.out.println(Arrays.equals(arrayOne,arrayTwo));
    }
}
