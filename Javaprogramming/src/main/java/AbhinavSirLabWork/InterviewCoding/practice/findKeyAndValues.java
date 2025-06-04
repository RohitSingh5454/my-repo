package AbhinavSirLabWork.InterviewCoding.practice;

import java.util.HashMap;
import java.util.Map;

public class findKeyAndValues {
    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<>();
        map1.put(1,"One");
        map1.put(2,"Two");
        map1.put(3,"Three");

                for (Map.Entry<Integer,String> entry: map1.entrySet()){
            if (entry.getValue().equals("Two")){
                System.out.println("key is "+entry.getKey());
            }
        }
    }
}
