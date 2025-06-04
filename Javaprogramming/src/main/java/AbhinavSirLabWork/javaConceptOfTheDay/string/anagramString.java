package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.Arrays;

public class anagramString {
    public static void main(String[] args) {
        isAnagram("Mother In Law", "Hitler Woman");

        isAnagram("keEp", "peeK");

        isAnagram("SiLeNt CAT", "LisTen AcT");

        isAnagram("Debit Card", "Bad Credit");
    }

    public static void isAnagram(String str1, String str2) {
        str1 = str1.replaceAll(" ", "");
        str2 = str2.replaceAll(" ", "");
        boolean isAnagrams = true;
        if (str1.length() != str2.length()) {
            isAnagrams = false;
        }

        else {

            System.out.println(str1.length());
            System.out.println(str2.length());
            char[] ch1 = str1.toLowerCase().toCharArray();
            char[] ch2 = str2.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
           isAnagrams= Arrays.equals(ch1,ch2);
        }
       if (isAnagrams){
           System.out.println(str1+ " "+ str2 +" are anagrams");
       }else {
           System.out.println(str1+ " "+ str2 +" are not anagrams");
       }
    }
}
