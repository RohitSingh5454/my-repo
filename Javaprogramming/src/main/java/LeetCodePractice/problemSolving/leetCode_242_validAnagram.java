package LeetCodePractice.problemSolving;

import java.util.Scanner;

public class leetCode_242_validAnagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String strs=sc.nextLine();
        boolean checkAnagram=isAnagram(str,strs);
        if (checkAnagram==true){
            System.out.println(str+ " and "+ strs+" are anagram");
        }
        else {
             System.out.println(str+ " and "+ strs+" are not anagram");
        }
    }
    public static boolean isAnagram(String s,String t){
          if (s.length()!=t.length()){
              return false;
          }
          int[] array=new int[26];
          for(int i=0;i<s.length();i++){
              array[s.charAt(i)-'a']++;
          }
        for(int i=0;i<t.length();i++){
            array[t.charAt(i)-'a']--;
            if (array[t.charAt(i)-'a']<0){
                return false;
            }
        }
        return true;
    }
}
