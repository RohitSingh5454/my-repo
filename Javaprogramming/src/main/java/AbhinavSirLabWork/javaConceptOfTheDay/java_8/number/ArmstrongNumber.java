package AbhinavSirLabWork.javaConceptOfTheDay.java_8.number;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int temp=num;
//        int sum=0;
//        while (temp>0){
//            int rem=temp%10;
//            sum=sum+rem*rem*rem;
//            temp/=10;
//        }
//        if (sum==num){
//            System.out.println(num+" is armstrong number");
//        }else {
//            System.out.println(num+ " is not armstrong number");
//        }
        int length=String.valueOf(num).length();
       int sums= IntStream.iterate(num,i->i/10).limit(length).map(i->(int) Math.pow(i%10,length)).sum();
       if (num==sums){
           System.out.println(num+" is armstrong number");
       }
       else {
           System.out.println(num+" is not armstrong number");
       }
    }
}
