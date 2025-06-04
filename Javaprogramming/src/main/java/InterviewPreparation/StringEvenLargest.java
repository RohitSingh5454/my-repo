package InterviewPreparation;

import java.util.Arrays;
import java.util.Comparator;

public class StringEvenLargest {
    public static void main(String[] args) {
        String str="Java is a programming language and platforme independent";
        String str1= Arrays.stream(str.split(" ")).filter(i->i.length()%2==0).max(Comparator.comparing(String::length)).orElse(" ");
        System.out.println(str1);

    }
}
