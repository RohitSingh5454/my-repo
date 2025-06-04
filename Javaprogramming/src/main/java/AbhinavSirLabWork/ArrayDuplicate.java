package AbhinavSirLabWork;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayDuplicate {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[] { 1, 2, 1, 3, 4, 4 };
        Set<Integer> allItems = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(numbers)
                .filter(n -> !allItems.add(n)) //Set.add() returns false if the item was already in the set.
                .collect(Collectors.toSet());
                System.out.println(duplicates);
         }
          }
