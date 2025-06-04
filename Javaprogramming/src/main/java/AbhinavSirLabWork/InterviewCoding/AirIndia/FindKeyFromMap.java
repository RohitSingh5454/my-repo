package AbhinavSirLabWork.InterviewCoding.AirIndia;

import java.util.HashMap;
import java.util.Map;

public class FindKeyFromMap {
    public static void main(String[] args) {
       Map<Integer,String> map=new HashMap<>();
       map.put(1,"one");
       map.put(2,"two");
       map.put(3,"three");
       int key=1;
       for (Map.Entry<Integer,String> entrySet:map.entrySet()){
           if (entrySet.getValue().equals("two")){
               key= entrySet.getKey();
              break;
           }
       }
        System.out.println(key);
    }
}
