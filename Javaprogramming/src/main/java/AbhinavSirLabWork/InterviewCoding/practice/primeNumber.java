package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.stream.IntStream;

public class primeNumber {
    public static void main(String[] args) {
        System.out.println(checkPrime(9));
    }
    boolean isPrime=true;
    public static boolean checkPrime(int num){
        if (num==1){
            return false;
        }
       boolean check= IntStream.rangeClosed(2,num/2).noneMatch(i->num%i==0);
        return check;
    }
}
