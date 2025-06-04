package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.Arrays;
import java.util.HashSet;

public class insertionArray {
    public static void main(String[] args) {
        String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};

        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
        HashSet<String> hs=new HashSet<>();
        for (int i=0;i<s1.length;i++){
            for (int j=0;j<s2.length;j++){
                if (s1[i].equals(s2[j])){
                   hs.add(s1[i]);
                }
            }
        }
        System.out.println(hs);
        //
        HashSet<String> hs2=new HashSet<>(Arrays.asList(s1));
        HashSet<String> hs3=new HashSet<>(Arrays.asList(s2));
        hs3.retainAll(hs2);
        System.out.println(hs3);
    }
}
