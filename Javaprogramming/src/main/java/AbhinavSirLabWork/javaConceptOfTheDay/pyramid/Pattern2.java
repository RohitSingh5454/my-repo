package AbhinavSirLabWork.javaConceptOfTheDay.pyramid;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for (int i=n;i>0;i--){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=count;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
            count++;
        }
    }
}
