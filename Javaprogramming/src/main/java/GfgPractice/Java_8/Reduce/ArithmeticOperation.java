package GfgPractice.Java_8.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class ArithmeticOperation {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("GFG", "Geeks", "for", "GeeksQuiz", "GeeksforGeeks");
        List<Integer> numbers = Arrays.asList(-2, 0, 4, 6, 8);
        Optional<String> largestWords=words.stream().reduce((word1, word2)->word1.length()>word2.length()?word1:word2);
        System.out.println(largestWords.get());
        // sum of all elements
        int sumNum=numbers.stream().reduce((num1,num2)->num1+num2).get();
        System.out.println(sumNum);
        // product of all elements
        int productNum= IntStream.rangeClosed(2,8).reduce((num1, num2)->num1*num2).orElse(-1);
        System.out.println(productNum);
    }
}
