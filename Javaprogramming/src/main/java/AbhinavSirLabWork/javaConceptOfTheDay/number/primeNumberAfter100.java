package AbhinavSirLabWork.javaConceptOfTheDay.number;

import java.util.Scanner;

public class primeNumberAfter100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean prime=isItPrime(num);
        if (prime){
            System.out.println(num+ " it is prime numb");
        }
        else {
            System.out.println(num+ " it is not prime");
        }

    }
    public static boolean isItPrime(int n){
        boolean isPrime=true;
        if (n==1){
            isPrime=true;
        }
        else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
}
