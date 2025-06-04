package AbhinavSirLabWork.Dsa.Pattern;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || j==n || i==m){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
