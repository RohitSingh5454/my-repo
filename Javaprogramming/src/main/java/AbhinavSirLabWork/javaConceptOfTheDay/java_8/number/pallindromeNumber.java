package AbhinavSirLabWork.javaConceptOfTheDay.java_8.number;

import java.util.stream.IntStream;

public class pallindromeNumber {
    public static void main(String[] args) {
        String str="ROTATOR";
        boolean isPallindrome= IntStream.rangeClosed(0,str.length()/2).
                noneMatch(st->str.charAt(st)!=str.charAt(str.length()-st-1));
        if (isPallindrome){
            System.out.println(str + " string is pallindrome");
        }
        else {
            System.out.println(str + " string is pallindrome");
        }
    }
}
