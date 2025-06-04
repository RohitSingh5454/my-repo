package LeetCodePractice.problemSolving;

import java.util.Scanner;

public class LeetCode_8StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String string = sc.nextLine();
            int result = stringToInt1(string);
            System.out.println("Input: \"" + string + "\"");
            System.out.println("Output: " + result);
            System.out.println();
        }
    }
    public static int stringToInt(String s){
       if(s.equals("")){
           return 0;
       }
       int res=0,i=0,sign=1;
       while (i<s.length() && s.charAt(i)==' '){
           i++;
       }
       if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
           if (s.charAt(i++)=='-'){
               sign=-1;
           }
       }
       while (i<s.length() && s.charAt(i)>='0' && s.charAt(i)<='9'){
//            if (res>Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && s.charAt(i)-'0'>7)){
//                if (sign==-1){
//                    return Integer.MIN_VALUE;
//                }
//                return Integer.MAX_VALUE;
//            }
            res=res*10+(s.charAt(i++)-'0');
       }
       return sign*res;
    }
    public static int stringToInt1(String s){
        s=s.trim();
        int i=0,res=0,sign=1;
        if (s.length()==0){
            return 0;
        }
        if (s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if (s.charAt(i)=='+'){
            i++;
        }
        //i++;
        while (i<s.length()) {
            char ch = s.charAt(i);
            if (ch >'9' || ch <'0') {
                break;
            }
                res = res * 10 + (s.charAt(i) - '0');
                if (sign * res > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (sign * res < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }

            i++;
        }
        return sign*res;
    }
}
