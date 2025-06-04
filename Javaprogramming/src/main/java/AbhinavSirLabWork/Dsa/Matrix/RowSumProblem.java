package AbhinavSirLabWork.Dsa.Matrix;

import java.util.Scanner;

public class RowSumProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int[][] array=new int[n][m];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        rowSum(array,n,m);
    }
    public static void rowSum(int[][] array,int n,int m){
        for (int i=0;i<n;i++){
            int sum=0;
            for (int j=0;j<m;j++){
                sum+=array[i][j];
            }
            System.out.println("Sum is "+sum);
        }
    }
}
