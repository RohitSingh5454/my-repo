package AbhinavSirLabWork.javaConceptOfTheDay;

import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("No of rows");
        int rows=sc.nextInt();

        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
        sc.close();

    }
}

//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5 6 7