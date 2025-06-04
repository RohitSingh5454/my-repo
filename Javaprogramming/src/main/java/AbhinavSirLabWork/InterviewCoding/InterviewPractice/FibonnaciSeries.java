package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int num1 = 0;
//        int num2 = 1;
//        int num3 = 0;
//        for (int i = 0; i < num; i++) {
//            System.out.print(num1 + " "); // 0 1 1 2 3
//            num3 = num1 + num2; //2
//            num1 = num2;
//            num2 = num3;
//        }
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacciSeries(i)+" ");
        }
        // java-8
        List<Integer> fibonacciSeries=
                Stream.iterate(new int[]{0,1},x->new int[]{x[1],x[0]+x[1]})
                        .limit(10).map(i->i[0]).collect(Collectors.toList());
        System.out.println(fibonacciSeries);
        int[] current=new int[]{0,1};
        List<Integer> fibonacciList=new ArrayList<>();
        for (int i=0;i<=num;i++){
            fibonacciList.add(current[0]);
            current=new int[]{current[1],current[0]+current[1]};
        }
        System.out.println(fibonacciList);
    }
    public static int fibonacciSeries(int n){
        int[] f=new int[n+2];
        f[0]=0;
        f[1]=1;
        for (int i=2;i<=n;i++){
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }
    // java-8

}
