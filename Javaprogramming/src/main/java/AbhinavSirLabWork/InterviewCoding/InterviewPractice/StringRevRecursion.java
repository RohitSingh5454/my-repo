package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import java.util.Arrays;

public class StringRevRecursion {
    public static void main(String[] args) {
        char[] str = "Hello".toCharArray();
        revString(str, 0, str.length - 1);
        String strs = "Hello";
        revString(strs);
    }

    public static void revString(char[] str, int start, int end) {
        if (start >= end) {
            System.out.println(Arrays.toString(str));
            return;
        }
        char temp = str[start];
        str[start] = str[end];
        str[end] = temp;
        revString(str, start + 1, end - 1);
    }

    public static void revString(String str) {
        if (str == null || str.length() <= 1) {
            System.out.print(str);
        } else {
            System.out.print(str.charAt(str.length() - 1));
            revString(str.substring(0, str.length() - 1));
        }
    }
}
