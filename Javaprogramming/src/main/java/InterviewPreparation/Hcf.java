package InterviewPreparation;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();  //22
        int b=sc.nextInt();  //33
        int g=0;

        for (int i=1;i<=a;i++){
            if (a%i==0 && b%i==0){
                g=i;
               //

            }
        }
        System.out.println(g);
    }
}
