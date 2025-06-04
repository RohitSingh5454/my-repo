package AbhinavSirLabWork.javaConceptOfTheDay.pyramid;

import java.util.Scanner;

public class Patternreverse_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=num;
        for (int i=0;i<num;i++){
            for (int j=1;j<=i*2;j++){
                System.out.printf(" ");
            }
            for (int j=1;j<=count;j++){
                System.out.printf(j+" ");
            }
            for (int j=count-1;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            count--;
        }
    }
}
