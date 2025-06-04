package AbhinavSirLabWork;

import java.util.stream.IntStream;

public class PrimeUsingJava8 {
    public static void main(String[] args) {
        PrimeUsingJava8 obj1=new PrimeUsingJava8();
        System.out.println("Prime no is " +obj1.checkPrime(11));
    }
    public boolean checkPrime(int num) {
        //int count=0;
       /* for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
            //}*/
            return num > 1 && IntStream.range(2, num).noneMatch(n -> num % n == 0);
        }
    }
