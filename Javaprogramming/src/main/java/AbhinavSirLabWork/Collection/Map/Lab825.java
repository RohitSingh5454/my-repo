package AbhinavSirLabWork.Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab825 {
    public static void main(String[] args) {
        Map map=new LinkedHashMap();
        map.put("eid",new Integer(78));
        map.put("name","Srinivas");
        map.put("phone",new Long(876443656L));
        System.out.println(map);
        System.out.println("remove(eid) "+map.remove("eid"));
        System.out.println(map);
        System.out.println("put-phone "+map.put("phone",new Long(5678282882L)));
        System.out.println(map);
        System.out.println("get() ");
        System.out.println(map.get("name"));
        System.out.println(map.get("email"));
    }
}
