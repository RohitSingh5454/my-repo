package AbhinavSirLabWork.HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String str="Abniket";
        Pattern p=Pattern.compile(str);
        System.out.println(p);
        while(testCases>0){
            String pattern = in.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
    }

