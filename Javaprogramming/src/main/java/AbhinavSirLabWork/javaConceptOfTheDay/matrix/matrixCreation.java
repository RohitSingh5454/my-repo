package AbhinavSirLabWork.javaConceptOfTheDay.matrix;

import java.util.Scanner;

public class matrixCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int[][] arrayMatrix = new int[rows][col];
        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < col; j++) {
                arrayMatrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("your matrix is ");
        for (int i = 0; i < arrayMatrix.length; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print( arrayMatrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}