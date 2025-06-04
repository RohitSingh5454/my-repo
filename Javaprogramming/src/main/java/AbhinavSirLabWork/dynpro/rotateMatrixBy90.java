package AbhinavSirLabWork.dynpro;

import java.util.Scanner;

public class rotateMatrixBy90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        // trapose matrix
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int temp=arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0,l=n-1;j<l;j++){
                int temp=arr1[i][j];
                arr1[i][j]=arr1[i][l];
                arr1[i][l]=temp;
                l--;
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
