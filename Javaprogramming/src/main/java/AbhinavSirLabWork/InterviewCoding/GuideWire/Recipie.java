package AbhinavSirLabWork.InterviewCoding.GuideWire;

import java.util.*;
import java.util.stream.Collectors;

public class Recipie {
    public static void main(String[] args) {
       String[] strings={"toast","bread","breada","cheese"};
       String str="abcdeeehrs";
       int totalPossible=makeDishes(strings,str);
        System.out.println(totalPossible);
    }
    public static int makeDishes(String[] recipes ,String S){
        int count=0;
       for (String string:recipes){
           if (canPrepare(string,S)){
               count++;
           }
       }
       return count;
    }
    public static boolean canPrepare(String recipe,String S){
        for (char ch:recipe.toCharArray()){
            if (S.indexOf(ch)==-1){
                return false;
            }
            S=S.replaceFirst(String.valueOf(ch),"");
        }
        return true;
    }
}
