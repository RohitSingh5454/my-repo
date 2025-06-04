package AbhinavSirLabWork.Dsa.Matrix;

import java.util.Scanner;

public class DiagonalMatrix {
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
        printDiagonal(array,noRows,noRows);
    }
    public static void printDiagonal(int[][] array,int noRows,int noCols){
        for(int i=0;i<noRows;i++){
            for (int j=noCols;j>0;j--){
                 if (i==j ||i==0){
                     System.out.print(array[i][j]+" ");
                 }
            }
            System.out.println();
        }
    }
}
