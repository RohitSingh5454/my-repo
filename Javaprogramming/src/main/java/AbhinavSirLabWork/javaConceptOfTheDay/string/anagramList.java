package AbhinavSirLabWork.javaConceptOfTheDay.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class anagramList {
    public static void main(String args[]) throws Exception {

        String[] words ={"eat", "tea", "tan", "ate", "nat", "bat"};

        for(List<String> list : groupAnagrams(words))
            System.out.println(list);

    }

    public static List<ArrayList<String>> groupAnagrams(String[] words) {

        List<ArrayList<String>> wordGroups = new ArrayList<ArrayList<String>>();
        HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();

        for(String word : words) {

            int sum = 0;
            for(char c : word.toCharArray())
                sum += c;
            if(map.containsKey(sum))
                map.get(sum).add(word);
            else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(word);
                map.put(sum, list);
            }

        }

        for(ArrayList<String> list : map.values())
            wordGroups.add(list);

        return wordGroups;
    }
}
