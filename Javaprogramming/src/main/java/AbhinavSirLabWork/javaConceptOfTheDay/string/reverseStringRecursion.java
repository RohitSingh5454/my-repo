package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.Scanner;

public class reverseStringRecursion {
    public static void main(String[] args) {
        String str="Radar";
       String str1= revString(str,"",str.length()-1);
        System.out.println(str1);
       if (str.equalsIgnoreCase(str1)){
           System.out.println(str+" "+str1 +" it is pallindrome ");
       }
       else {
           System.out.println(str+" "+str1 +" it is not pallindrome ");
       }
    }
    public static String revString(String str,String rev ,int n){
        if (n<0){
          return rev;
        }
        return revString(str,rev+str.charAt(n),n-1);
    }
}
