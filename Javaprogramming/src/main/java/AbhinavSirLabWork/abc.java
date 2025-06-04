package AbhinavSirLabWork;

import java.util.*;

public class abc {
    public static void main(String[] args) {
       /* Given an array of strings strs, group the anagrams together. You can return the answer in any order.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

                Example 1:

        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]*/
        String[] list= {"eat","tea","tan","ate","nat","bat"};
        Object[] ch= Arrays.stream(list).toArray();

        HashMap<String,Integer> hs=new HashMap<>();

        HashSet<String> hashSet=new HashSet<>();
        for (String i:list){
            if (!hs.containsKey(i)){
                hs.put(i,1);
            }
            else {
                hs.put(i,hs.get(i)+1);
            }
        }
        Set<Map.Entry<String,Integer>> entrySet=hs.entrySet();
        for (Map.Entry<String,Integer> entry:entrySet)
        {
            if (entry.getValue()>1){
                hashSet.add(entry.getKey());
            }
            else {
                hashSet.add(entry.getKey());
            }
        }
        System.out.println(hashSet);
        }

        }




