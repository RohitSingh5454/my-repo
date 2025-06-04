package AbhinavSirLabWork.javaConceptOfTheDay.string;

import com.google.common.math.Quantiles;

import java.util.Scanner;

public class pyramidNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int count=1;
        for (int i=rows;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=count;j++){
                System.out.print(count+" ");
            }
            System.out.println();
            count++;
        }
    }
}
