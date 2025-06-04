package AbhinavSirLabWork.Dsa.Pattern;

import java.util.Scanner;

public class RightTriangleValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        int temp=1;
        for(int i=1;i<n;i++){
            temp=num;
            for(int j=1;j<=i;j++){
                System.out.print(temp+" ");
                temp=temp*i+2*j;
            }
            num=num+1;
            System.out.println();
        }
    }
}
