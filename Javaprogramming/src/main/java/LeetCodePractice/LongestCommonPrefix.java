package LeetCodePractice;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(LongestCommonString(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonSubString(new String[]{"flower","flow","flight"}));
    }

    public static String LongestCommonString(String[] str) {
        if (str == null || str.length == 0) {
            return " ";
        }
        StringBuilder strs = new StringBuilder();
        int c = 0;
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length - 1];
        while (c < first.length()) {
            if (first.charAt(c) == last.charAt(c)) {
                strs.append(first.charAt(c));
                c++;
            } else {
                break;
            }
        }
        return strs.toString();
    }

    public static String longestCommonSubString(String[] strings) {
        Arrays.sort(strings);
        String first = strings[0];
        String last = strings[strings.length - 1];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
               return stringBuilder.append(" ").toString();
            }
                stringBuilder.append(first.charAt(i));
        }
        return stringBuilder.toString();
    }
}