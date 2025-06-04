package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.*;

public class findOccurence {
    public static void main(String[] args) {
        String[] array = {"apples", "are", "red"};   // op should be like a is present in which string and how many times
        HashMap<String,Integer> hm = new HashMap<>();
        char target='a';
        for (String str: array){
            int count=0;
            for (char ch:str.toCharArray()){
                if (ch==target){
                    count++;
                }
            }
            if (count>0){
                hm.put(str,count);
            }
        }
        for (Map.Entry<String,Integer> entry: hm.entrySet()){
            System.out.println("character "+target+ " " + "is present in "+entry.getKey()+" and times it is present "+entry.getValue());
        }

    }
}
