package AbhinavSirLabWork.dynpro;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if (str1.length()==str2.length()){
            char[] ch1=str1.toCharArray();
            char[] ch2=str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
           boolean isAnagram= Arrays.equals(ch1,ch2);
           if (isAnagram){
               System.out.println(str1+" "+str2+" are anagrams");
           }
        }



    }
}
