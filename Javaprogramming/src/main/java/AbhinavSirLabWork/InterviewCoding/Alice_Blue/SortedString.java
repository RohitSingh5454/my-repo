package AbhinavSirLabWork.InterviewCoding.Alice_Blue;

import java.util.Arrays;
import java.util.Collections;

public class SortedString {
    public static void main(String[] args) {
        String str="tree";

        // expected o/p=eert
      char[] ch=  str.toCharArray();
        for (int i=0;i<ch.length;i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
            for (char i: ch){
                System.out.print(i );
        }
    }
}
