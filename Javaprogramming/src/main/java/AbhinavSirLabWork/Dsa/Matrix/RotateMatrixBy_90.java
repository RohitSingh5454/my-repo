package AbhinavSirLabWork.Dsa.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrixBy_90 {
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
        rotateMatrix(array,noRows,noCols);
    }
    public static void rotateMatrix(int[][] array,int m,int n){
        // trapose matrix
        for (int i=0;i<m;i++){
            for (int j=i;j<n;j++){
                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        // swap matrix by rows
        for (int i=0;i<m;i++){
            for (int j=0;j<n/2;j++){
                int temp=array[i][j];
               array[i][j]=array[i][n-j-1];
                array[i][n-j-1]=temp;
            }
            System.out.println();
        }
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        //System.out.println(Arrays.toString(array));
    }
}
