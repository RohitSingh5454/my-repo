package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.stream.IntStream;

public class pallindromeString {
    public static void main(String[] args) {
        System.out.println(checkPallindrome("RACECAR"));
    }
    public static boolean checkPallindrome(String str){
    boolean isPallindrome=  IntStream.rangeClosed(0,str.length()/2).allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
    return isPallindrome;
    }
}
