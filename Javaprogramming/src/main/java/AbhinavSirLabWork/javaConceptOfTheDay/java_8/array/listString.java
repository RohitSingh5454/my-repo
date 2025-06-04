package AbhinavSirLabWork.javaConceptOfTheDay.java_8.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class listString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");
      String str=  words.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(str);
    }
}
