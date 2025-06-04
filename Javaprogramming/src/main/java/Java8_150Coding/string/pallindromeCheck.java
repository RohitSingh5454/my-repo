package Java8_150Coding.string;

import java.util.stream.IntStream;

public class pallindromeCheck {
    public static void main(String[] args) {
        String str="ROTATOR";
        boolean isPallindrome= IntStream.range(0,str.length()/2).
                allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));
        if (isPallindrome){
            System.out.println("it is pallindrome");
        }
        else {
            System.out.println("It is not pallindrome");
        }
    }
}
