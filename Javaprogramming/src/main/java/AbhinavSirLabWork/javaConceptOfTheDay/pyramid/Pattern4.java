package AbhinavSirLabWork.javaConceptOfTheDay.pyramid;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int count=1;
        for (int i=rows;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.printf(" ");
            }
            for (int j=1;j<=count;j++){
                System.out.printf(j+" ");
            }
            for (int j=count-1;j>=1;j--){
                System.out.print(j+" ");
            }
            count++;
            System.out.println();
        }
    }
}
