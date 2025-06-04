package AbhinavSirLabWork.javaConceptOfTheDay.matrix;

import java.util.Scanner;

public class matrixAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] array1=new int[rows][cols];
        int[][] array2=new int[rows][cols];
        int[][] resultArray=new int[rows][cols];
        System.out.println("enter the first matrix");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                array1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the second matrix");
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                array2[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                resultArray[i][j]=array1[i][j]/array2[i][j];
                System.out.print(resultArray[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
