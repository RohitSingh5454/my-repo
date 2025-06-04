package Java8_150Coding.MethodReference;

import java.util.function.Function;

public class MethodReferenceExample2 {
    public static void main(String[] args) {

        // using lambda expression
        Function<String, Integer> lambdaFunction = (String s) -> Integer.parseInt(s);
        System.out.println(lambdaFunction.apply("123"));
        // using method reference
        Function<String, Integer> methodReference = Integer::parseInt;
        System.out.println(lambdaFunction.apply("432"));
    }
}
