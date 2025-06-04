package LeetCodePractice.problemSolving;

import java.util.HashSet;
import java.util.Scanner;

public class LeetCode3_LongestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int maxCount = longestSubString(str);
        System.out.println("maximum count is " + maxCount);

    }

    public static int longestSubString(String str) {
        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        int max = 0;
        for (int right = 0; right < str.length(); right++) {
            while (hs.contains(str.charAt(right))) {
                hs.remove(str.charAt(left));
                left++;
            }
            hs.add(str.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
