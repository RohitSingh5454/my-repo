package InterviewPreparation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class reverseEachWord {
    public static void main(String[] args) {
        String str="java is platform independent language";
        String revChar= Arrays.stream(str.split(" ")).
                map(word->new StringBuilder(word).reverse()).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        System.out.println(revChar);
    }
}
