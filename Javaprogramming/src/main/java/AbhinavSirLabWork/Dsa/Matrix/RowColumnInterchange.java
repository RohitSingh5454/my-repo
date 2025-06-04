package AbhinavSirLabWork.Dsa.Matrix;

import java.util.Scanner;

public class RowColumnInterchange {
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
        rowInterchangeWithColumn(array,noRows,noCols);
    }
    public static void rowInterchangeWithColumn(int[][] array,int noRows,int noCols) {
        int[][] rotated=new int[noRows][noCols];
        for (int i = 0; i < noRows ; i++) {
            for (int j = 0; j <noCols; j++) {
               rotated[j][noRows-i-1]=array[i][j];
            }
        }
        for (int i = 0; i < noRows ; i++) {
            for (int j = 0; j <noCols; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();

        }
    }
}
