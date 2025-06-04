package Java8_150Coding.string;

import java.util.Arrays;

public class reverseEachword {
    public static void main(String[] args) {
        String str="java concept of the day";
        String[] strs=str.split(" ");
         String revString="";
        for (int k=0;k<strs.length;k++){
            String word=strs[k];
            String revWord="";
            for (int j=word.length()-1;j>=0;j--){
                revWord=revWord+word.charAt(j);
            }
            revString=revString+revWord+" ";
        }
        System.out.println(revString);
    }
    // another way

}
