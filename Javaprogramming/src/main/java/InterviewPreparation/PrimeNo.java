package InterviewPreparation;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numb=sc.nextInt();
        if (isPrime(numb)){
            System.out.println(numb+" is prime number");
        }
        else {
            System.out.println(numb+" is not prime no");
        }


    }
    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}

