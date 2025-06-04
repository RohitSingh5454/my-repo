package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.HashMap;
import java.util.Scanner;

public class firstRepeatedNonRepeated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        firstRepeatedandNonRepeated(str);
    }
    public static void firstRepeatedandNonRepeated(String input){
        HashMap<Character,Integer> hashMap=new HashMap<>();
        char[] ch=input.toCharArray();
        for (char c:ch){
            if (hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c)+1);
            }
            else {
                hashMap.put(c,1);
            }
        }
        for (char c:ch){
            if (hashMap.get(c)==1){
                System.out.println("First non repeated element is " +c);
                break;
            }}
        for (char c:ch)
            if (hashMap.get(c)>1){
                System.out.println("First repeated character is "+c);
                break;
            }
        }
    }

