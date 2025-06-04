package  AbhinavSirLabWork.HackerRank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LexicographicalOrder {
 public static void main(String[] args) {
      getSmallestAndLargest("MyNameIsRohit",3);
    }
    public static String getSmallestAndLargest(String s,int k){
         String smallest="";
         String largest="";
         String[] str=new String[s.length()-k+1];
         for (int i=0;i< str.length-k+1;i++){
             String temp=s.substring(i,i+k);
             str[i]=temp;
         }
        Arrays.sort(str, Comparator.nullsLast(Comparator.naturalOrder()));
        smallest=str[0];
        largest=str[str.length-1];
        System.out.println("Smallest "+smallest);
        System.out.println("Largest "+largest);
        return smallest +"\n" +largest;
    }
}