package AbhinavSirLabWork.Dsa.Matrix;

import java.util.Scanner;
//Sample Input 0
//
//        2 2
//        15 -10
//        19 8
//        Sample Output 0
//
//        15 19
//        -10 8

public class TraposeMatrix {
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
            for (int j=i+1;j<noCols;j++){
                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
        for (int i=0;i<noRows;i++){
            for (int j=0;j<noCols;j++){
                System.out.print(array[i][i]+" ");
            }
            System.out.println();
        }
    }
}
