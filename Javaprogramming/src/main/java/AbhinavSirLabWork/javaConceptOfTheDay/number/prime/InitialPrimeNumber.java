package AbhinavSirLabWork.javaConceptOfTheDay.number.prime;

import java.util.Scanner;

public class InitialPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int counter=1;
        int check=100;
        while (counter<=num){
            if (initialPrime(check)){
                System.out.println(check);
                counter++;
                check++;
            }
            else {
                check++;
            }
        }
        sc.close();
    }
    public static boolean initialPrime(int num){
        boolean isItPrime=true;
        if (num<=1){
            isItPrime=false;
            return isItPrime;
        }else {
        for (int i=2;i<num;i++){
            if (num%i==0){
                isItPrime=false;
                break;
            }
            }
        return isItPrime;
        }
    }
}
