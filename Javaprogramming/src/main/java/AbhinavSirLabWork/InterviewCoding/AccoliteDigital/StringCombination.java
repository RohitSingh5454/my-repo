package AbhinavSirLabWork.InterviewCoding.AccoliteDigital;

import java.util.*;

public class StringCombination {
    public static void main(String[] args) {
        getCombination("abc","");
    }
    public static void getCombination(String str,String ans){
        if (str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);  //a  b
        String rem=str.substring(1);  //bc  c
        getCombination(rem,ans+ch); //bc +a
        getCombination(rem,ans);
    }
}
