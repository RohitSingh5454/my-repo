package AbhinavSirLabWork.javaConceptOfTheDay.string;

import com.google.common.collect.ImmutableList;

public class firstWordImmutableList {
    public static void main(String[] args) {
        ImmutableList<String> inputNames = ImmutableList.of("rohit singh","srikant tirunagri");// print Srikant Rohit
        for (String i:inputNames){
            String[] parts=i.split(" ");
            System.out.println(parts[0]);
        }
        // using java-8
        inputNames.stream().map(i->i.split(" ")[0]).forEach(System.out::println);
    }
}
