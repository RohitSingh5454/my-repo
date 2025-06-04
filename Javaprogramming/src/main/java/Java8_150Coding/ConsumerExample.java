package Java8_150Coding;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names=List.of("Naveen","Sachin","Dravid","Laxman","Dhoni");

        names.forEach(cn-> System.out.println(cn));
       // names.forEach(System.out::println);
    }
}
