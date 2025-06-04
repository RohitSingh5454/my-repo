package AbhinavSirLabWork.javaConceptOfTheDay.number.prime;

import java.util.Scanner;

public class primeNumbersBetweenTwoNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int sum=0;
        for (int i=end;i>=start;i--){
            if (isPrime(i)){
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println("sum of prime number "+sum);
        sc.close();
    }
    public static boolean isPrime(int no){
       boolean isItPrime=true;
       if (no<=1){
           isItPrime=false;
           return isItPrime;
       }else {
           for (int i=2;i<no;i++){
               if (no%i==0){
                   isItPrime=false;
                   break;
               }
           }
           return isItPrime;
       }
    }
}
