package AbhinavSirLabWork.Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab823 {
    public static void main(String[] args) {
        Map map=new HashMap<>();
       /* System.out.println(map);
        System.out.println(map.size());
        System.out.println("Is empty "+map.isEmpty());*/
        map.put("eid",new Integer(99) );
        map.put("name","srinivas");
        map.put("phone",new Long(99887766l));
        map.put("valid",new Boolean(true));
        System.out.println(map);
        System.out.println(map.size());
    }
}
