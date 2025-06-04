package InterviewPreparation.Stream;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintDuplicate {
    public static void main(String[] args) {
        Map<Character,Integer> map=new HashMap<>();
        String str="howToDoInJava";
        for (char c:str.toCharArray()){

        if (map.containsKey(c)){
            map.put(c,map.get(c)+1);
        }
        else {
            map.put(c,1);
        }
        }
        Iterator<Map.Entry<Character,Integer>> it=map.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
