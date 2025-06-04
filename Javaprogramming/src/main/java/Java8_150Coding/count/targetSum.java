package Java8_150Coding.count;

import java.util.HashMap;

public class targetSum {
    public static void main(String[] args) {
        int[] arr1 = {6, 4, 7, 12};
        int target = 18;

        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            int c = target - arr1[i];
            if (hs.containsKey(c)) {
                System.out.println(hs.get(c) + " " + i);
            } else {
                hs.put(arr1[i], i);
            }
        }
    }}
