package AbhinavSirLabWork.javaConceptOfTheDay.java_8.number;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class fibonacciNumber {
    public static void main(String[] args) {
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]}).limit(7).
                map(i->i[0]).forEach(System.out::println);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter positive number");
        int inputNum=sc.nextInt();
        int firstNum=0;
        int secondNum=1;
        int thirdNum=0;
        while (thirdNum<inputNum){
            thirdNum=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=thirdNum;
        }
        if (thirdNum==inputNum){
            System.out.println("Number belongs to  fibonacci series ");
        }
        else {
            System.out.println("Number belongs does not belong to  fibonacci series ");
        }
    }
}
