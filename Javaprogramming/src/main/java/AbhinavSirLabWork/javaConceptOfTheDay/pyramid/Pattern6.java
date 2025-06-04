package AbhinavSirLabWork.javaConceptOfTheDay.pyramid;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        /*        9
                8 9 8
              7 8 9 8 7
            6 7 8 9 8 7 6
          5 6 7 8 9 8 7 6 5
        4 5 6 7 8 9 8 7 6 5 4
      3 4 5 6 7 8 9 8 7 6 5 4 3
    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1*/
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int count=1;
        for (int i=rows;i>0;i--){
            for (int j=1;j<=i*2;j++){
                System.out.printf(" ");
            }
            for (int j=i;j<=rows;j++){
                System.out.printf(j+" ");
            }
            for (int j=rows-1;j>=i;j--){
                System.out.printf(j+" ");
            }
            System.out.println();
            count++;
        }

    }
}
