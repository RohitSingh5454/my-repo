package AbhinavSirLabWork.javaConceptOfTheDay.matrix;

import java.util.Scanner;

public class matrixSaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        int rows = sc.nextInt();
        System.out.println("enter the number of columns");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("enter the elemnts");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the input matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        findSaddlePoint(matrix);
        sc.close();
    }
        public static void findSaddlePoint(int[][] matrix)
        {
            for (int i = 0; i < matrix.length; i++) {
                int rowMin = matrix[i][0];
                int colIndex = 0;
                boolean saddlePoint = true;
                for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] < rowMin) {
                        rowMin = matrix[i][j];
                        colIndex = j;
                    }
                }
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[j][colIndex] > rowMin) {
                        saddlePoint = false;
                        break;
                    }
                }
                if (saddlePoint) {
                    System.out.println("saddle point is " + rowMin);
                }
            }
        }
    }
