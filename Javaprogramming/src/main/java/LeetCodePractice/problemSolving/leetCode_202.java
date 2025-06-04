package LeetCodePractice.problemSolving;

import java.util.HashMap;
import java.util.HashSet;

public class leetCode_202 {
    public static void main(String[] args) {
       boolean x= isHappy(8);
       if (x==true){
           System.out.println("It is happy number");
       }
       else {
           System.out.println("It is not happy number");
       }
    }
    public static int squareNumber(int num){
        int sum=0;
        int temp=num;
        while (temp>0){
            int rem=temp%10;
            sum+=(rem*rem);
            temp/=10;
        }
        return sum;
    }
    public static boolean isHappy(int n){
        HashSet<Integer> hs=new HashSet<>();
        int ret;
        while (n!=0 && !hs.contains(n)){
            hs.add(n);
            n=squareNumber(n);
        }
       if (n==1){
           return true;
       }
       else {
           return false;
       }
    }
}
