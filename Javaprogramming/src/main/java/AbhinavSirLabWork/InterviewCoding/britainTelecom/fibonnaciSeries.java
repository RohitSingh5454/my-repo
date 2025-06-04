package AbhinavSirLabWork.InterviewCoding.britainTelecom;

import java.util.Scanner;
public class fibonnaciSeries {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int n1=0;
       int nn=9;
       int n2=1;
       int n3;
       for (int i=0;i<num;i++){
           System.out.print(n1+" ");
           n3=n1+n2;
           n1=n2;
           n2=n3;
       }
    }
}
