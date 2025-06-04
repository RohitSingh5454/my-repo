package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.Scanner;

public class uniqueNumber {
    public static void main(String[] args) {
        int n,n1,n2,r1,r2,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n1=n;
        n2=n;
       while (n1>0){
           r1=n1%10;
           while (n2>0){
               r2=n2%10;
               if (r1==r2){
                   c++;
               }
               n2=n2/10;
           }
           n1=n1/10;
       }
       if (c==1){
           System.out.println("It is unique number");
       }
       else {
           System.out.println("It is not unique number");
       }
    }
}