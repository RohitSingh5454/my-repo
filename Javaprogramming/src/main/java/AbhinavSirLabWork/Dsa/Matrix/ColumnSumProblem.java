package AbhinavSirLabWork.Dsa.Matrix;

import java.util.Scanner;

public class ColumnSumProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noRows=sc.nextInt();
        int noCols=sc.nextInt();
        int[][] array=new int[noRows][noCols];
        for (int i=0;i<noRows;i++){
            for (int j=0;j<noCols;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<noRows;i++){
            for (int j=0;j<noCols;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        columnSum(array,noRows,noCols);
    }
    public static void columnSum(int[][] array,int noRows,int noCols){

        for (int i=0;i<noCols;i++){
            int sum=0;
            for (int j=0;j<noRows;j++){
                sum+=array[j][i];
            }
            System.out.println("Sum column wise "+sum);
        }
    }
}
