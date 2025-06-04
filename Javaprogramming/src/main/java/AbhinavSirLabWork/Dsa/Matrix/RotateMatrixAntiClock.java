package AbhinavSirLabWork.Dsa.Matrix;
import java.util.Scanner;

public class RotateMatrixAntiClock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noRows=sc.nextInt();
        int noCols=sc.nextInt();
        int[][] array=new int[noRows][noCols];
        for(int i=0;i<noRows;i++){
            for(int j=0;j<noCols;j++){
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<noRows;i++) {
            for (int j = 0; j < noCols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        rotateAntiClock(array,noRows,noCols);
    }
    public static void traposeMatrix(int[][] array,int noRows,int noCols) {
        for (int i = 0; i < noRows; i++) {
            for (int j = 0; j < noCols; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }
    public static void rotateAntiClock(int[][] array,int noRows,int noCols){
        traposeMatrix(array,noRows,noCols);
        for(int i=0;i<noRows;i++){
            for(int j=0;j<noCols/2;j++){
                int temp=array[i][j];
               array[i][j]=array[i][noCols-j-1];
                array[i][noCols-j-1]=temp;
            }
        }
        for(int i=0;i<noRows;i++){
            for(int j=0;j<noCols;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
