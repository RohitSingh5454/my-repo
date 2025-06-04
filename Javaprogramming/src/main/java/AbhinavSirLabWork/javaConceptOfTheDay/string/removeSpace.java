package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.Scanner;

public class removeSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which need to be replace extra space");
        String str = sc.nextLine();
        // 1st way
        String str1 = str.replaceAll("\\s+", "");
       // System.out.println(str1);
        // 2nd way
        char[] ch = str.toCharArray();
        String string = "";
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ' ) {
                string = string + str.charAt(i);
            }
        }
        System.out.println(string);
    }
}
