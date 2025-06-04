package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        printFibonacci(num);
        // using java 8
        List<Integer> fibonacciSeries=Stream.iterate(new int[]{0,1},p->new int[]{p[1],p[1]+p[0]}).limit(5)
                .map(k->k[0]).collect(Collectors.toList());
        System.out.println(fibonacciSeries);
    }
    public static void printFibonacci(int num){
       int num1=0,num2=1;
       int num3=num1+num2;
        System.out.print(num1+" "+num2+" ");
        for (int i=2;i<num;i++){
            num1=num2;
            num2=num3;
            num3=num1+num2;
            System.out.print(num2+" ");
        }
    }
}

