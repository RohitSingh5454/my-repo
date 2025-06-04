package AbhinavSirLabWork.javaConceptOfTheDay.number.prime;

import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        isPrime(14);
        boolean isPrime=isPrimeCheck(num);
        if (isPrime){
            System.out.println(num+ " Number is prime " +num);
        }else {
            System.out.println(num + " Number is not prime");
        }
    }
    public static void isPrime(int no){
        int count=0;
        if (no==1 && no>0){
            System.out.println("number is prime "+no);
        }
        for (int i=2;i<=no;i++){
            if (no%i==0){
                count++;
            }
        }
        if (count==1){
            System.out.println("Number is prime "+no);
        }
        else if (count>1){
            System.out.println("Number is not prime "+no);
        }
    }
    public static boolean isPrimeCheck(int number){
        boolean isItPrime=true;
        if (number<=1){
            isItPrime=false;
            return isItPrime;
        }else {
            for (int i=2;i<number;i++){
                if (number%i==0){
                    isItPrime=false;
                    break;
                }
            }
            return isItPrime;
        }

    }
}
