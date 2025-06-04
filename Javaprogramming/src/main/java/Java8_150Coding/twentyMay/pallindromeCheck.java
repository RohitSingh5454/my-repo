package Java8_150Coding.twentyMay;

import java.util.stream.IntStream;

public class pallindromeCheck {
    public static void main(String[] args) {
        String str = "ROTATOR";
        boolean isPallindrome= IntStream.rangeClosed(0,str.length()/2).
                noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1));
        if (isPallindrome){
            System.out.println("string are pallindrome");
        }
        else {
            System.out.println("string is not pallindrome");
        }
    }
}
