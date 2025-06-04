package AbhinavSirLabWork.Collection.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Lab827 {
    public static void main(String[] args) {
        Map m1=new LinkedHashMap();
        m1.put("eid",new Integer(78));
        m1.put("name","srinivas");
        m1.put("phone",new Long(87654456L));
        m1.put("valid",new Boolean(true));
        System.out.println("keys and values");
        Set data=m1.entrySet();
        Iterator it= data.iterator();
        while (it.hasNext()){
            Object obn=it.next();
            Map.Entry entry=(Map.Entry)obn;
            Object key=entry.getKey();
            Object val=entry.getValue();
            System.out.println(key +"\t\t"+val);
        }
    }
}
