package AbhinavSirLabWork.javaConceptOfTheDay.java_8.string;

import java.util.stream.IntStream;

public class pallindrome {
    public static void main(String[] args) {
        String str = "ROTATOR";
       boolean isPallindrome= IntStream.rangeClosed(0,str.length()/2).noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1));
       if (isPallindrome){
           System.out.println(str+ " it is pallindrome string");
       }else {
           System.out.println(str+ " it is not pallindrome string");
       }
    }
}
