package AbhinavSirLabWork.FlatMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JoinThePrefixSuffix {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Java","Is","Platform","Independent","Language");
        String joining=list.stream().collect(Collectors.joining(" ,","[","]"));
        System.out.println(joining);
        // find the number multiple of 5

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().filter(i->i%5==0).collect(Collectors.toList()).forEach(System.out::println);

        // find max and min number
        int max=listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Max number is "+max);

        // find min number

        int min=listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min number is "+min);

        // merge two array

        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        int[] merge= IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().toArray();

        System.out.println("After concatination array is "+Arrays.toString(merge));
        List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
       // find three minimum
       listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
       // find three max
        System.out.println("Printing largest 3 numbers");
        listOfIntegers1.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

        // two strings are anagram

        String s1 = "RaceCar";
        String s2 = "CarRace";
        s1= Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        s2=Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("String is anagram");
        }
        else {
            System.out.println("String is not anagram");
        }

        // sum of all digits

        int i = 15623;
        Integer sumOfDigits=Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumOfDigits);

        // find second largest number is
        List<Integer> listOfIntegers2 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer secondLargest=listOfIntegers2.stream().
                sorted(Comparator.reverseOrder()).skip(1).limit(1).findFirst().get();
        System.out.println(secondLargest);
    }
}
