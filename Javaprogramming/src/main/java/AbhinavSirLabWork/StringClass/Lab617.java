package StringClass;

import java.util.Scanner;

public class Lab617 {
    public static void main(String[] args) {

        String bow="Premanand ji maharaj";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str1=sc.nextLine();
        System.out.println("Enter the string");
        String st2=sc.nextLine().intern();
        System.out.println(str1==st2);
    }
}
