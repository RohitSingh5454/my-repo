package GfgPractice.Predicate;

import java.util.Arrays;

public class GfgSumAverageArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int sum=0;

        for (int i=0;i< a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
       sum= Arrays.stream(a).sum();
        System.out.println(sum);
        System.out.println("Average is : "+sum/ a.length);
        System.out.println("Printing arrays element");
        Arrays.stream(a).forEach(i->{
            System.out.print(i+" ");
        });
    }
}
