package StringClass;

import java.util.Scanner;

public class Lab618 {
    public static void main(String[] args) {
        String str="JLC";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s3=sc.nextLine();
        System.out.println("Enter the 2nd string");
        String s4=sc.nextLine();
        System.out.println("Enter the 3rd string");
        String s5=s3;
        String s6=s4;
        System.out.println(s5.equals(s6));

    }
}
