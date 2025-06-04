package AbhinavSirLabWork.javaConceptOfTheDay.number;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         String str=null;
        System.out.println(str);
        System.out.println(str.length());
         boolean prime=checkPrime(num);
         if (prime){
             System.out.println(num+" is prime number");
         }
         else {
             System.out.println(num+" is not prime number");
         }
    }
    public static boolean checkPrime(int num){
        boolean isPrime=true;
        if (num==1 || num==0){
             isPrime=false;
             return isPrime;
        }
        for (int i=2;i<num/2;i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
