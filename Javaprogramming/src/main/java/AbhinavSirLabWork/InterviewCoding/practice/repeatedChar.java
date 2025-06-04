package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.HashSet;

public class repeatedChar {
    public static void main(String[] args) {
        String str="java concept of the day";
        String str1=str.replaceAll(" ","");
        char[] ch=str1.toCharArray();
        HashSet<Character> hs=new HashSet<>();
        for (char i:ch){
            if (!hs.contains(ch)){
                hs.add(i);
            }else {
                hs.remove(i);
            }
        }
        System.out.println(hs);
    }
}
