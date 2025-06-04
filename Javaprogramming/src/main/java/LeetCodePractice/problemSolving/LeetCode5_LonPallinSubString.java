package LeetCodePractice.problemSolving;

import java.util.HashSet;

public class LeetCode5_LonPallinSubString {
    int max=0,start=0,end=0;
    public static void main(String[] args) {
        LeetCode5_LonPallinSubString ob=new LeetCode5_LonPallinSubString();
        String str=ob.longestPallindromeSubString2("babad");
        System.out.println(str);
    }
    public static boolean isPallindrome(String s,int i,int j){
        while (i<=j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);
            if (ch1!=ch2){
                return false;
            }
            j--;
            i++;
        }
        return true;
    }
    public  String longestPallindromeSubString2(String s){
        int max=0;
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if (isPallindrome(s,i,j)){
                    if (j-i+1>max){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
}
