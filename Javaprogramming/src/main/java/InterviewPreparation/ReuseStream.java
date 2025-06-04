package InterviewPreparation;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReuseStream {
    public static void main(String[] args) {
        String[] input=new String[]{"Amit","Sachin","Rakesh","Manoj"};
        Stream<String> stream=Arrays.stream(input);
       long count= stream.filter(i->"Amit".equals(i)).count();
        System.out.println(count);
    }
}
