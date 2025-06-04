package AbhinavSirLabWork.InterviewCoding.wisson;

import java.util.Scanner;

public class deliveryRoute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] distances = new int[5];
        System.out.println("Enter exactly 5 distances:");

        for (int i = 0; i < 5; i++) {
            distances[i] = sc.nextInt();
        }

        int equilibriumIndex = findEquilibriumIndex(distances);
        System.out.println("Equilibrium index: " + equilibriumIndex);

        sc.close();
    }

    public static int findEquilibriumIndex(int[] distances) {
        int totalSum = 0;
        for (int distance : distances) {
            totalSum += distance;
        }

        int leftSum = 0;
        for (int i = 0; i < distances.length; i++) {
            totalSum -= distances[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += distances[i];
        }

        return -1;
    }
}
